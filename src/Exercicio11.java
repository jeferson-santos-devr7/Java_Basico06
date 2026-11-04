import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;
import java.util.List;

public class Exercicio11 {
    public static void main(String[] args) throws IOException {
        Path arquivo = Path.of("teste.txt");
        List<String> linhas = Files.readAllLines(arquivo);

        long count = linhas.stream().filter(l -> !l.trim().isEmpty()).count();
        System.out.println("Linhas não vazias: " + count);
    }
}