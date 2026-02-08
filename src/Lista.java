public class Lista{
    private Livro[] elementos;
    private int tamanho;

    public Lista(int capacidade){
        this.elementos = new Livro[capacidade];
        this.tamanho = 0;
    }

    public boolean isFull(){
        return tamanho == elementos.length;
    }

    public boolean isEmpty(){
        return tamanho == 0;
    }

    public boolean adicionar(Livro elemento){
        if(isFull()) return false;
        elementos[tamanho++] = elemento;
        return true;
    }
    public Livro buscar(Livro elemento){
        for (int i = 0; i < tamanho; i++){
            if(elementos[i].getTitulo().equals(elemento.getTitulo())){
                return elementos[i];
            }
        }
        return null;
    }
    public boolean remover(Livro elemento){
        for (int i = 0; i < tamanho; i++){
            if (elementos[i].getTitulo().equals(elemento.getTitulo())){
                for (int j = i; j < tamanho - 1; j++){
                    elementos[j] = elementos[j+1];
                }
                elementos[--tamanho] = null;
                return true;
            }
        }
        return false;
    }
}
