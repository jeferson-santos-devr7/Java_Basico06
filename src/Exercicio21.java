import java.nio.file.*;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class Exercicio21 {
    public static void main(String[] args) throws IOException {
        Path csv = Path.of("produtos.csv");
        Path erros = Path.of("erros.log");

        if (!Files.exists(csv)) {
            Files.writeString(csv, "Mouse,80.0\nInvalido\nTeclado,150.0\n");
        }

        List<String> linhas = Files.readAllLines(csv);
        List<String> linhasComErro = new ArrayList<>();

        for (String linha : linhas) {
            String[] partes = linha.split(",");
            if (partes.length != 2) {
                linhasComErro.add("Linha inválida: " + linha);
            }
        }

        Files.write(erros, linhasComErro);
        System.out.println("Importação finalizada. Erros registados em log.");
    }
}