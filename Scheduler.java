


public class Scheduler {
    private ListaDeProcessos lista;
    private int indiceAtual;
    private int tempoGlobal;
    private int processosFinalizados;
    private int somaEspera;
    private int somaTurnaround;
    

    public Scheduler(int capacidade) {
        lista = new ListaDeProcessos(capacidade);
        indiceAtual = 0;
        tempoGlobal = 0;
        processosFinalizados = 0;
        somaEspera = 0;
        somaTurnaround = 0;
    }

    public void adicionarProcesso(Processo p) {
        lista.adicionar(p);
    }

    public void executarCicloDeCPU() {
        if (lista.vazio()) {
            System.out.println("Nenhum processo para executar.");
            return;
        }

        Processo atual = lista.get(indiceAtual);
        System.out.println("Tempo " + tempoGlobal + " -> Executando: " + atual.getNome());

        // Executa o ciclo
        atual.executarCiclo();
        tempoGlobal++;

        // Atualiza espera para todos os outros
        for (int i = 0; i < lista.tamanho(); i++) {
            if (i != indiceAtual) {
                lista.get(i).incrementarEspera();
            }
        }

        // Se finalizou, remove e registra métricas
        if (atual.finalizado()) {
            atual.setTempoFinalizacao(tempoGlobal);
            System.out.println("Processo " + atual.getNome() + " finalizado no tempo " + tempoGlobal);

            somaEspera += atual.getTempoEspera();
            somaTurnaround += atual.getTurnaround();
            processosFinalizados++;

            lista.remover(indiceAtual);

            if (lista.tamanho() > 0) {
                indiceAtual %= lista.tamanho();
            }
        } else {
            // Avança circularmente
            indiceAtual = (indiceAtual + 1) % lista.tamanho();
        }
    }

    public boolean temProcessos() {
        return !lista.vazio();
    }

    public void mostrarRelatorio() {
        System.out.println("\n===== RELATÓRIO FINAL =====");
        System.out.println("Processos finalizados: " + processosFinalizados);
        if (processosFinalizados > 0) {
            double esperaMedia = (double) somaEspera / processosFinalizados;
            double turnaroundMedio = (double) somaTurnaround / processosFinalizados;

            System.out.println("Tempo médio de espera: " + esperaMedia);
            System.out.println("Tempo médio de turnaround: " + turnaroundMedio);
        }
    }
}
