public class Fila {
    private Usuario[] elementos;
    private int frente;
    private int cauda;
    private int capacidade;
    private int tamanho;

    public Fila(int capacidade) {
        this.capacidade = capacidade;
        this.elementos = new Usuario[capacidade];
        this.frente = 0;
        this.cauda = 0;
        this.tamanho = 0;
    }

    public boolean isEmpty() {
        return tamanho == 0;
    }

    public boolean isFull() {
        return tamanho == capacidade;
    }

    public boolean enqueue(Usuario elemento) {
        if (isFull()) {
            System.out.println("Fila cheia!");
            return false;
        }
        elementos[cauda] = elemento;  // Coloca o usuário no final da fila
        cauda = (cauda + 1) % capacidade;  // Faz a fila circular
        tamanho++;
        return true;
    }

    public Usuario dequeue() {
        if (isEmpty()) {
            System.out.println("Fila vazia!");
            return null;
        }
        Usuario usuario = elementos[frente];
        frente = (frente + 1) % capacidade;  // Faz a fila circular
        tamanho--;
        return usuario;
    }

    public int size() {
        return tamanho;
    }

    public Usuario elementoFrente() {
        if (!isEmpty()) {
            return elementos[frente];
        }
        return null;
    }
}