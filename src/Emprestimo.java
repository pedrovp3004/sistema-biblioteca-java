import java.time.LocalDate;

public class Emprestimo {
    private Usuario usuario;
    private Livro livro;
    private String data;

    public Emprestimo(Usuario usuario, Livro livro){
        this.usuario = usuario;
        this.livro = livro;
        this.data = LocalDate.now().toString();
    }

    public String toString(){
        return usuario.getNome()+" pegou " +livro.getTitulo()+ " em " + data;
    }
}
