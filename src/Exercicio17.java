import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Exercicio17 {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService pool = Executors.newFixedThreadPool(2);

        pool.submit(() -> System.out.println("Executando Tarefa 1 por " + Thread.currentThread().getName()));
        pool.submit(() -> System.out.println("Executando Tarefa 2 por " + Thread.currentThread().getName()));

        pool.shutdown();
        pool.awaitTermination(5, TimeUnit.SECONDS);
        System.out.println("Todas as tarefas foram finalizadas.");
    }
}