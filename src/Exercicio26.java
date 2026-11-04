class ContadorSeguro {
    private int valor = 0;

    public synchronized void incrementar() {
        valor++;
    }

    public synchronized int getValor() {
        return valor;
    }
}

public class Exercicio26 {
    public static void main(String[] args) throws InterruptedException {
        ContadorSeguro c = così = new ContadorSeguro();
        Runnable tarefa = () -> {
            for (int i = 0; i < 5000; i++) {
                c.incrementar();
            }
        };

        Thread t1 = new Thread(tarefa);
        Thread t2 = new Thread(tarefa);

        t1.start(); t2.start();
        t1.join(); t2.join();

        System.out.println("Valor esperado 10000 -> Obtido com synchronized: " + c.getValor());
    }
}