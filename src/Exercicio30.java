import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Exercicio09 {
    private static final Logger log = LoggerFactory.getLogger(Exercicio09.class);

    public static void main(String[] args) {
        long pedidoId = 10025L;
        double valorTotal = 450.75;

        log.info("Processando fechamento de pedido: pedidoId={} valorTotal={}", pedidoId, valorTotal);
    }
}