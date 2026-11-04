import java.util.logging.Logger;
import java.util.logging.Level;

public class Exercicio20 {
    private static final Logger LOG = Logger.getLogger(Exercicio20.class.getName());

    public static void main(String[] args) {
        LOG.info("Iniciando processamento do sistema...");
        try {
            int resultado = 10 / 0;
        } catch (ArithmeticException e) {
            LOG.log(Level.SEVERE, "Erro crítico: divisão por zero detectada!", e);
        }
        LOG.warning("Atenção: o sistema encerrou com avisos de falha.");
    }
}