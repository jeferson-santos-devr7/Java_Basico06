import java.util.concurrent.CompletableFuture;

public class Exercicio28 {
    public static void main(String[] args) {
        CompletableFuture<Double> precoProduto = CompletableFuture.supplyAsync(() -> 150.0);
        CompletableFuture<Double> valorFrete = CompletableFuture.supplyAsync(() -> 25.0);

        Double total = precoProduto.thenCombine(valorFrete, Double::sum).join();

        System.out.println("Preço total combinado (Produto + Frete): R$ " + total);
    }
}