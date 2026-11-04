import java.nio.file.*;
import java.io.IOException;
import java.util.stream.Stream;

public class Exercicio12 {
    public static void main(String[] args) throws IOException {
        try (Stream<Path> stream = Files.walk(Path.of("."))) {
            long qtd = stream.filter(Files::isRegularFile)
                    .filter(p -> p.toString().endsWith(".java"))
                    .count();
            System.out.println("Total de arquivos .java encontrados: " + qtd);
        }
    }
}