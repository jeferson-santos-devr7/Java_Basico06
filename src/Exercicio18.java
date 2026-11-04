import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class Exercicio18 {
    public static void definirPreco(double preco) {
        if (preco < 0) {
            throw new IllegalArgumentException("O preço não pode ser negativo.");
        }
    }

    @Test
    void deveLancarExcecaoParaPrecoNegativo() {
        assertThrows(IllegalArgumentException.class, () -> {
            definirPreco(-10.0);
        });
    }
}