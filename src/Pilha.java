public class Pilha {
    private String[] historico;
    private int topo;

    public Pilha(int capacidade) {
        this.historico = new String[capacidade];
        this.topo = -1;
    }

    public boolean isEmpty() {
        return topo == -1;
    }

    public boolean isFull() {
        return topo == historico.length - 1;
    }

    public boolean push(String operacao) {
        if (isFull()) return false;
        historico[++topo] = operacao;
        return true;
    }

    public String pop() {
        if (isEmpty()) return null;
        return historico[topo--];
    }

    public String top() {
        if (isEmpty()) return null;
        return historico[topo];
    }
}
