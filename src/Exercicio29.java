import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercicio29 {
    public static double calcularFrete(String regiao) {
        return switch (regiao.toUpperCase()) {
            case "SP" -> 15.0;
            case "RJ" -> 20.0;
            default -> 40.0;
        };
    }

    @ParameterizedTest
    @CsvSource({"SP, 15.0", "RJ, 20.0", "MG, 40.0"})
    void deveCalcularFreteCorretamentePorRegiao(String regiao, double esperado) {
        assertEquals(esperado, calcularFrete(regiao));
    }
}