import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class Exercicio08 {
    public static int soma(int a, int b) {
        return a + b;
    }

    @Test
    void deveSomarDoisNumerosCorretamente() {
        int resultado = soma(3, 7);
        assertEquals(10, resultado, "A soma de 3 + 7 deve ser 10");
    }
}