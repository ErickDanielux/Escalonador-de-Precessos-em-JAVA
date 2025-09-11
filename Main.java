public class Main {
    public static void main(String[] args) {
        Scheduler scheduler = new Scheduler(10);

        scheduler.adicionarProcesso(new Processo("P1", 3, 0));
        scheduler.adicionarProcesso(new Processo("P2", 5, 0));
        scheduler.adicionarProcesso(new Processo("P3", 2, 0));

        while (scheduler.temProcessos()) {
            scheduler.executarCicloDeCPU();
        }

        scheduler.mostrarRelatorio();
    }
}

