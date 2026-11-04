import java.util.concurrent.atomic.AtomicInteger;

public class Exercicio27 {
    public static void main(String[] args) throws InterruptedException {
        AtomicInteger contador = new AtomicInteger(0);
        Runnable tarefa = () -> {
            for (int i = 0; i < 5000; i++) {
                contador.incrementAndGet();
            }
        };

        Thread t1 = new Thread(tarefa);
        Thread t2 = new Thread(tarefa);

        t1.start(); t2.start();
        t1.join(); t2.join();

        System.out.println("Valor com AtomicInteger (sem locks manuais): " + contador.get());
    }
}