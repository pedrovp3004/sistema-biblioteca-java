import java.time.LocalDate;

public class Biblioteca {
    private Lista listaLivros;
    private Pilha historico;
    private Fila filaEspera;

    public Biblioteca(int capacidadeLivros, int capacidadeUsuarios) {
        this.listaLivros = new Lista(capacidadeLivros);
        this.historico = new Pilha(100);
        this.filaEspera = new Fila(capacidadeLivros);  // Fila de espera para livros
    }

    public void cadastrarLivro(String titulo, String autor, short anoPublicacao, short disponiveis) {
        Livro livroAdicionado = new Livro(titulo, autor, anoPublicacao, disponiveis);
        listaLivros.adicionar(livroAdicionado);
        historico.push("Cadastro do livro: " + livroAdicionado.getTitulo());
        System.out.println("Livro cadastrado!");
    }

    public void buscarLivro(String titulo) {
        Livro livroEncontrado = listaLivros.buscar(new Livro(titulo, null, (short) 0, (short) 0));
        if (livroEncontrado != null) {
            System.out.println("Livro encontrado: " + livroEncontrado);
        } else {
            System.out.println("Livro não encontrado");
        }
    }

    public void removerLivro(String titulo) {
        Livro livroRemovido = listaLivros.buscar(new Livro(titulo, null, (short) 0, (short) 0));
        if (livroRemovido != null) {
            listaLivros.remover(livroRemovido);
            historico.push("Livro Removido: " + titulo);
            System.out.println("Livro Removido: " + titulo);
        } else {
            System.out.println("Livro não encontrado!");
        }
    }

    public void emprestarLivro(String tituloLivro, Usuario usuario) {
        Livro livroEmprestado = listaLivros.buscar(new Livro(tituloLivro, null, (short) 0, (short) 0));

        if (livroEmprestado != null) {
            if (livroEmprestado.getDisponiveis() > 0) {
                livroEmprestado.setDisponiveis((short) (livroEmprestado.getDisponiveis() - 1));
                String dataEmprestimo = LocalDate.now().toString();
                historico.push("Empréstimo de '" + tituloLivro + "' para " + usuario.getNome() + " em " + dataEmprestimo);
                System.out.println("Empréstimo realizado para o livro: " + tituloLivro + " por " + usuario.getNome());
            } else {
                filaEspera.enqueue(usuario);  // Coloca o usuário na fila de espera
                System.out.println("Livro não disponível! O usuário '" + usuario.getNome() + "' entrou para fila de espera.");
            }
        } else {
            System.out.println("Livro não encontrado!");
        }
    }

    public void devolverLivro(String titulo) {
        Livro livroDevolvido = listaLivros.buscar(new Livro(titulo, null, (short) 0, (short) 0));
        if (livroDevolvido != null) {
            livroDevolvido.setDisponiveis((short) (livroDevolvido.getDisponiveis() + 1));
            historico.push("Devolução do livro: " + titulo);
            System.out.println("Livro devolvido com sucesso!");

            if (!filaEspera.isEmpty()) {
                Usuario proxUsuario = filaEspera.dequeue();
                System.out.println("O próximo da fila é: " + proxUsuario.getNome() + ". O livro será emprestado.");
            }
        } else {
            System.out.println("Livro não encontrado!");
        }
    }

    public void exibirHistorico() {
        System.out.println("Histórico de operações:");

        Pilha historicoTemp = new Pilha(100);

        while (!historico.isEmpty()) {
            String operacao = historico.pop();
            System.out.println(operacao);  // Exibe a operação
            historicoTemp.push(operacao);  // Coloca de volta na pilha temporária
        }

        while (!historicoTemp.isEmpty()) {
            historico.push(historicoTemp.pop());
        }
    }

    public void desfazerUltOperacao() {
        String operacao = historico.pop();
        if (operacao != null) {
            System.out.println("Última operação desfeita: " + operacao);
        } else {
            System.out.println("Nenhuma operação para desfazer!");
        }
    }

    public void consultarDisponibilidade(String titulo) {
        Livro livroConsulta = listaLivros.buscar(new Livro(titulo, null, (short) 0, (short) 0));
        if (livroConsulta != null) {
            System.out.println("Disponibilidade do livro: " + titulo + ": " + livroConsulta.getDisponiveis() + " exemplares disponíveis");
        } else {
            System.out.println("Livro não encontrado!");
        }
    }
}
