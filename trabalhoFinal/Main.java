import java.util.List;
import java.util.Scanner;

public class Main {
    private static Biblioteca biblioteca = new Biblioteca();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE GERENCIAMENTO DE BIBLIOTECA ===");
        
        // Cadastrar alguns dados de exemplo
        cadastrarDadosExemplo();
        int opcao;
        do {
            exibirMenu();
            opcao = lerInteiro("Digite uma opção: ");
            processarOpcao(opcao);
        } while (opcao != 0);

        System.out.println("Sistema encerrado. Obrigado!");
        scanner.close();
    }

    private static void exibirMenu() {
        System.out.println();
        System.out.println("--- MENU PRINCIPAL ---");
        System.out.println("1. Cadastrar Livro");
        System.out.println("2. Cadastrar Cliente");
        System.out.println("3. Realizar Empréstimo");
        System.out.println("4. Realizar Devolução");
        System.out.println("5. Buscar Livros");
        System.out.println("6. Listar Empréstimos Ativos");
        System.out.println("7. Listar Empréstimos Atrasados");
        System.out.println("8. Exibir Histórico Completo");
        System.out.println("9. Listar Acervo");
        System.out.println("10. Listar Clientes");
        System.out.println("11. Buscar Cliente por CPF");
        System.out.println("0. Sair");
    }

    private static void processarOpcao(int opcao) {
        switch (opcao) {
            case 1:
                cadastrarLivro();
                break;
            case 2:
                cadastrarCliente();
                break;
            case 3:
                realizarEmprestimo();
                break;
            case 4:
                realizarDevolucao();
                break;
            case 5:
                buscarLivros();
                break;
            case 6:
                biblioteca.exibirEmprestimosAtivos();
                break;
            case 7:
                biblioteca.exibirEmprestimosAtrasados();
                break;
            case 8:
                biblioteca.exibirHistoricoCompleto();
                break;
            case 9:
                listarAcervo();
                break;
            case 10:
                listarClientes();
                break;
            case 11:
                buscarClientePorCPF();
                break;
            case 0:
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }

    private static void cadastrarLivro() {
        System.out.println();
        System.out.println("--- CADASTRAR LIVRO ---");
        System.out.println("1. Livro Físico");
        System.out.println("2. Ebook");
        int tipo = lerInteiro("Escolha o tipo: ");

        String titulo = lerString("Título: ");
        String autor = lerString("Autor: ");
        String identificador = lerString("Identificador: ");
        String categoria = lerString("Categoria: ");

        if (tipo == 1) {
            int exemplares = lerInteiro("Quantidade de exemplares: ");
            LivroFisico livro = new LivroFisico(titulo, autor, identificador, categoria, exemplares);
            biblioteca.adicionarLivro(livro);
            System.out.println("Livro físico cadastrado com sucesso!");
        } else if (tipo == 2) {
            Ebook ebook = new Ebook(titulo, autor, identificador, categoria);
            biblioteca.adicionarLivro(ebook);
            System.out.println("Ebook cadastrado com sucesso!");
        } else {
            System.out.println("Tipo inválido!");
        }
    }

    private static void cadastrarCliente() {
        System.out.println("\n--- CADASTRAR CLIENTE ---");
        String nome = lerString("Nome: ");
        String cpf = lerString("CPF: ");
        String numeroCadastro = lerString("Número de Cadastro: ");

        Cliente cliente = new Cliente(nome, cpf, numeroCadastro);
        biblioteca.cadastrarCliente(cliente);
        System.out.println("✓ Cliente cadastrado com sucesso!");
    }

    private static void realizarEmprestimo() {
        System.out.println("\n--- REALIZAR EMPRÉSTIMO ---");
        
        Cliente cliente = selecionarCliente();
        if (cliente == null) return;

        Livro livro = selecionarLivro();
        if (livro == null) return;

        try {
            biblioteca.realizarEmprestimo(cliente, livro);
        } catch (LivroIndisponivelException e) {
            System.out.println("✗ Erro: " + e.getMessage());
        }
    }
    
    private static void realizarDevolucao() {
        System.out.println("\n--- REALIZAR DEVOLUÇÃO ---");
        
        Cliente cliente = selecionarCliente();
        if (cliente == null) return;

        // Mostrar apenas livros emprestados pelo cliente
        List<Emprestimo> emprestimosCliente = cliente.getEmprestimosAtivos();
        if (emprestimosCliente.isEmpty()) {
            System.out.println("Este cliente não possui empréstimos ativos.");
            return;
        }

        System.out.println("Livros emprestados por " + cliente.getNome() + ":");
        for (int i = 0; i < emprestimosCliente.size(); i++) {
            System.out.println((i + 1) + ". " + emprestimosCliente.get(i).getLivro().getTitulo());
        }

        int escolha = lerInteiro("Escolha o livro para devolver: ") - 1;
        if (escolha >= 0 && escolha < emprestimosCliente.size()) {
            Livro livro = emprestimosCliente.get(escolha).getLivro();
            biblioteca.devolverEmprestimo(cliente, livro);
        } else {
            System.out.println("Opção inválida!");
        }
    }

    private static void buscarLivros() {
        System.out.println("\n--- BUSCAR LIVROS ---");
        System.out.println("1. Buscar por termo geral");
        System.out.println("2. Buscar por título");
        System.out.println("3. Buscar por autor");
        System.out.println("4. Buscar por categoria");
        int tipoBusca = lerInteiro("Escolha o tipo de busca: ");

        List<Livro> resultados;
        switch (tipoBusca) {
            case 1:
                String termo = lerString("Termo de busca: ");
                resultados = biblioteca.buscarLivros(termo);
                break;
            case 2:
                String titulo = lerString("Título: ");
                resultados = biblioteca.buscarPorTitulo(titulo);
                break;
            case 3:
                String autor = lerString("Autor: ");
                resultados = biblioteca.buscarPorAutor(autor);
                break;
            case 4:
                String categoria = lerString("Categoria: ");
                resultados = biblioteca.buscarPorCategoria(categoria);
                break;
            default:
                System.out.println("Opção inválida!");
                return;
        }

        if (resultados.isEmpty()) {
            System.out.println("Nenhum livro encontrado.");
        } else {
            System.out.println("Resultados da busca:");
            resultados.forEach(System.out::println);
        }
    }

    private static void listarAcervo() {
        System.out.println("\n--- ACERVO COMPLETO ---");
        List<Livro> acervo = biblioteca.getAcervo();
        if (acervo.isEmpty()) {
            System.out.println("Nenhum livro no acervo.");
        } else {
            acervo.forEach(System.out::println);
        }
    }

    private static void listarClientes() {
        System.out.println("\n--- CLIENTES CADASTRADOS ---");
        List<Cliente> clientes = biblioteca.getClientes();
        if (clientes.isEmpty()) {
            System.out.println("Nenhum cliente cadastrado.");
        } else {
            clientes.forEach(System.out::println);
        }
    }

    private static void buscarClientePorCPF() {
        System.out.println("\n--- BUSCAR CLIENTE POR CPF ---");
        String cpf = lerString("CPF: ");
        Cliente cliente = biblioteca.buscarClientePorCPF(cpf);
        if (cliente != null) {
            System.out.println("Cliente encontrado: " + cliente);
            cliente.listarEmprestimosAtivos();
        } else {
            System.out.println("Cliente não encontrado.");
        }
    }

    private static Cliente selecionarCliente() {
        List<Cliente> clientes = biblioteca.getClientes();
        if (clientes.isEmpty()) {
            System.out.println("Nenhum cliente cadastrado.");
            return null;
        }

        System.out.println("Clientes disponíveis:");
        for (int i = 0; i < clientes.size(); i++) {
            System.out.println((i + 1) + ". " + clientes.get(i).getNome() + " - " + clientes.get(i).getCpf());
        }

        int escolha = lerInteiro("Escolha o cliente: ") - 1;
        if (escolha >= 0 && escolha < clientes.size()) {
            return clientes.get(escolha);
        } else {
            System.out.println("Opção inválida!");
            return null;
        }
    }

    private static Livro selecionarLivro() {
        List<Livro> acervo = biblioteca.getAcervo();
        if (acervo.isEmpty()) {
            System.out.println("Nenhum livro no acervo.");
            return null;
        }

        System.out.println("Livros disponíveis:");
        for (int i = 0; i < acervo.size(); i++) {
            System.out.println((i + 1) + ". " + acervo.get(i));
        }

        int escolha = lerInteiro("Escolha o livro: ") - 1;
        if (escolha >= 0 && escolha < acervo.size()) {
            return acervo.get(escolha);
        } else {
            System.out.println("Opção inválida!");
            return null;
        }
    }

    // Métodos auxiliares para leitura de dados
    private static String lerString(String mensagem) {
        System.out.print(mensagem);
        return scanner.nextLine();
    }

    private static int lerInteiro(String mensagem) {
        while (true) {
            try {
                System.out.print(mensagem);
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Por favor, digite um número válido.");
            }
        }
    }

    private static void cadastrarDadosExemplo() {
        // Cadastrar alguns livros de exemplo
        biblioteca.adicionarLivro(new LivroFisico("Dom Casmurro", "Machado de Assis", "001", "Literatura", 3));
        biblioteca.adicionarLivro(new LivroFisico("1984", "George Orwell", "002", "Ficção", 2));
        biblioteca.adicionarLivro(new Ebook("Clean Code", "Robert Martin", "003", "Tecnologia"));
        biblioteca.adicionarLivro(new LivroFisico("A Revolução dos Bichos", "George Orwell", "004", "Ficção", 1));
        biblioteca.adicionarLivro(new Ebook("Domain Driven Design", "Eric Evans", "005", "Tecnologia"));

        // Cadastrar alguns clientes de exemplo
        biblioteca.cadastrarCliente(new Cliente("João Silva", "123.456.789-00", "CLI001"));
        biblioteca.cadastrarCliente(new Cliente("Maria Santos", "987.654.321-00", "CLI002"));
        biblioteca.cadastrarCliente(new Cliente("Pedro Costa", "111.222.333-00", "CLI003"));

        System.out.println("✓ Dados de exemplo cadastrados automaticamente.");
    }
}