import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Biblioteca sistema = new Biblioteca(100, 200);
        Scanner scanf = new Scanner(System.in);

        int opcao;

        while (true) {
            System.out.println("\n----MENU----");
            System.out.println("1 - Cadastrar Livro");
            System.out.println("2 - Remover Livro");
            System.out.println("3 - Buscar Livro");
            System.out.println("4 - Emprestar Livro");
            System.out.println("5 - Devolução Livro");
            System.out.println("6 - Exibir Histórico");
            System.out.println("7 - Desfazer Última Operação");
            System.out.println("8 - Consultar Disponibilidade de um Livro");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanf.nextInt();

            scanf.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Título do livro: ");
                    String titulo = scanf.nextLine();
                    System.out.print("Autor do livro: ");
                    String autor = scanf.nextLine();
                    System.out.print("Ano da Publicação do livro: ");
                    short anoPubli = scanf.nextShort();
                    System.out.print("Quantidade de exemplares: ");
                    short qtd = scanf.nextShort();
                    sistema.cadastrarLivro(titulo, autor, anoPubli, qtd);
                    break;

                case 2:
                    System.out.print("Título do livro: ");
                    String livroRemovido = scanf.nextLine();
                    sistema.removerLivro(livroRemovido);
                    break;

                case 3:
                    System.out.print("Título do livro: ");
                    String livroBuscado = scanf.nextLine();
                    sistema.buscarLivro(livroBuscado);
                    break;

                case 4:
                    System.out.print("Título do livro para emprestar: ");
                    String tituloLivro = scanf.nextLine();
                    System.out.print("Nome do Usuário: ");
                    String nomeUsuarioEmprestimo = scanf.nextLine();
                    // Criação de um objeto Usuario para registrar o nome do usuário
                    Usuario usuarioEmprestimo = new Usuario(nomeUsuarioEmprestimo);
                    sistema.emprestarLivro(tituloLivro,usuarioEmprestimo);
                    break;

                case 5:
                    System.out.print("Título do livro: ");
                    tituloLivro = scanf.nextLine();
                    sistema.devolverLivro(tituloLivro);
                    break;

                case 6:
                    sistema.exibirHistorico();
                    break;

                case 7:
                    sistema.desfazerUltOperacao();
                    break;

                case 8:
                    System.out.print("Título do livro: ");
                    String livro = scanf.nextLine();
                    sistema.consultarDisponibilidade(livro);
                    break;

                case 0:
                    System.out.println("Desligando o Sistema...");
                    scanf.close();
                    return;  // Encerra o programa

                default:
                    System.out.println("Opção Inválida! Tente Novamente!");
                    break;
            }
        }
    }
}
