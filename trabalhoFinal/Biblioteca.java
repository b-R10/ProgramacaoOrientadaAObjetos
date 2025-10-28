import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Biblioteca {
    private List<Livro> acervo;
    private List<Cliente> clientes;
    private List<Emprestimo> emprestimosAtivos;
    private List<Emprestimo> historicoEmprestimos;

    public Biblioteca() {
        this.acervo = new ArrayList<>();
        this.clientes = new ArrayList<>();
        this.emprestimosAtivos = new ArrayList<>();
        this.historicoEmprestimos = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        acervo.add(livro);
    }

    public List<Livro> buscarLivros(String termo) {
        return acervo.stream()
                .filter(livro -> livro.contemTermo(termo))
                .collect(Collectors.toList());
    }

    public List<Livro> getAcervo() {
        return new ArrayList<>(acervo);
    }

    public List<Cliente> getClientes() {
        return new ArrayList<>(clientes);
    }

    public void cadastrarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public Cliente buscarClientePorCPF(String cpf) {
        return clientes.stream()
                .filter(cliente -> cliente.getCpf().equals(cpf))
                .findFirst()
                .orElse(null);
    }

    public void realizarEmprestimo(Cliente cliente, Livro livro) throws LivroIndisponivelException {
        // verifica se é emprestavel
        if (!(livro instanceof Emprestavel)) {
            throw new LivroIndisponivelException("Este livro (" + livro.getTitulo() + ") nao pode ser emprestado");
        }

        Emprestavel emprestavel = (Emprestavel) livro;

        // tenta emprestar o livro
        emprestavel.emprestar();

        // cria o emprestimo
        Emprestimo emprestimo = new Emprestimo(cliente, livro);
        emprestimosAtivos.add(emprestimo);
        historicoEmprestimos.add(emprestimo);
        cliente.adicionarEmprestimo(emprestimo);

        System.out.println("Empréstimo realizado com sucesso");
    }

    public void devolverEmprestimo(Cliente cliente, Livro livro) {
        Emprestimo emprestimo = emprestimosAtivos.stream()
                .filter(emp -> emp.getCliente().equals(cliente) && emp.getLivro().equals(livro))
                .findFirst()
                .orElse(null);

        if (emprestimo != null) {
            try {
                emprestimo.devolver();
                emprestimosAtivos.remove(emprestimo);
                cliente.removerEmprestimo(emprestimo);
                System.out.println("Devolucao registrada com sucesso");
            } catch (PrazoDevolucaoExcedidoException e) {
                System.out.println("AVISO: " + e.getMessage());
                emprestimosAtivos.remove(emprestimo);
                cliente.removerEmprestimo(emprestimo);
            }
        } else {
            System.out.println("Emprestimo nao encontrado");
        }
    }

    public void exibirEmprestimosAtivos() {
        System.out.println("- Emprestimos ativos:");
        if (emprestimosAtivos.isEmpty()) {
            System.out.println("Nenhum emprestimo ativo");
        } else {
            emprestimosAtivos.forEach(System.out::println);
        }
    }

    public void exibirHistoricoCompleto() {
        System.out.println("- Historico completo:");
        if (historicoEmprestimos.isEmpty()) {
            System.out.println("Nenhum emprestimo no historico");
        } else {
            historicoEmprestimos.forEach(System.out::println);
        }
    }

    public void exibirEmprestimosAtrasados() {
        System.out.println("- Emprestimos atrasados:");
        List<Emprestimo> atrasados = emprestimosAtivos.stream()
                .filter(Emprestimo::verificarAtraso)
                .collect(Collectors.toList());

        if (atrasados.isEmpty()) {
            System.out.println("Nenhum emprestimo atrasado");
        } else {
            atrasados.forEach(emp -> System.out.println(emp + " - atraso: " + emp.getDiasAtraso() + " dias"));
        }
    }

    public List<Livro> buscarPorTitulo(String titulo) {
        return acervo.stream()
                .filter(livro -> livro.getTitulo().toLowerCase().contains(titulo.toLowerCase()))
                .collect(Collectors.toList());
    }

    public List<Livro> buscarPorAutor(String autor) {
        return acervo.stream()
                .filter(livro -> livro.getAutor().toLowerCase().contains(autor.toLowerCase()))
                .collect(Collectors.toList());
    }

    public List<Livro> buscarPorCategoria(String categoria) {
        return acervo.stream()
                .filter(livro -> livro.getCategoria().equalsIgnoreCase(categoria))
                .collect(Collectors.toList());
    }
}