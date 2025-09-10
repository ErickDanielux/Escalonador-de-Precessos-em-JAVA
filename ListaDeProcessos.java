public class ListaDeProcessos {
    private Processo[] processos;
    private int total;

    public ListaDeProcessos(int capacidade) {
        processos = new Processo[capacidade];
        total = 0;
    }

    public void adicionar(Processo p) {
        if (total < processos.length) {
            processos[total] = p;
            total++;
        }
    }

    public void remover(int indice) {
        for (int i = indice; i < total - 1; i++) {
            processos[i] = processos[i + 1];
        }
        processos[total - 1] = null;
        total--;
    }

    public Processo get(int indice) {
        return processos[indice];
    }

    public int tamanho() {
        return total;
    }

    public boolean vazio() {
        return total == 0;
    }
}

