public class Processo {
    private String nome;
    private int burstTime;      // tempo total de execução (CPU)
    private int tempoRestante;  // tempo ainda necessário
    private int tempoChegada;   // quando entrou no sistema
    private int tempoFinalizacao; // tempo em que terminou a execução
    private int tempoEspera;    // acumulado

    public Processo(String nome, int burstTime, int tempoChegada) {
        this.nome = nome;
        this.burstTime = burstTime;
        this.tempoRestante = burstTime;
        this.tempoChegada = tempoChegada;
        this.tempoFinalizacao = -1;
        this.tempoEspera = 0;
    }

    public String getNome() {
        return nome;
    }

    public int getBurstTime() {
        return burstTime;
    }

    public int getTempoRestante() {
        return tempoRestante;
    }

    public int getTempoChegada() {
        return tempoChegada;
    }

    public int getTempoFinalizacao() {
        return tempoFinalizacao;
    }

    public void setTempoFinalizacao(int tempo) {
        this.tempoFinalizacao = tempo;
    }

    public void incrementarEspera() {
        if (tempoRestante > 0) {
            tempoEspera++;
        }
    }

    public int getTempoEspera() {
        return tempoEspera;
    }

    public int getTurnaround() {
        return tempoFinalizacao - tempoChegada;
    }

    public void executarCiclo() {
        if (tempoRestante > 0) {
            tempoRestante--;
        }
    }

    public boolean finalizado() {
        return tempoRestante == 0;
    }
}

