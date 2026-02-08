public class Livro {
    private String titulo;
    private String autor;
    private short anoPublicacao;
    private short disponiveis;

    public Livro(String titulo, String autor, short anoPublicacao, short disponiveis) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.disponiveis = disponiveis;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public short getAnoPublicacao() {
        return anoPublicacao;
    }

    public short getDisponiveis() {
        return disponiveis;
    }

    public void setDisponiveis(short disponiveis) {
        this.disponiveis = disponiveis;
    }

    @Override
    public String toString() {
        return getTitulo() + " - " + getAutor() + " (" + getAnoPublicacao() + ") - Disponíveis: " + getDisponiveis();
    }
}
