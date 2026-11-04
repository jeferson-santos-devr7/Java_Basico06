public class Exercicio06 {
    public static void main(String[] args) throws InterruptedException {
        Runnable tarefa = () -> {
            for (int i = 1; i <= 3; i++) {
                System.out.println(Thread.currentThread().getName() + " - Execução " + i);
            }
        };

        Thread t1 = new Thread(tarefa, "Thread-A");
        Thread t2 = new Thread(tarefa, "Thread-B");

        t1.start();
        t2.start();

        t1.join();
        t2.join();
    }
}