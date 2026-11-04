import java.nio.file.*;
import java.io.IOException;
import java.util.stream.Stream;

public class Exercicio05 {
    public static void main(String[] args) throws IOException {
        try (Stream<Path> stream = Files.list(Path.of("."))) {
            stream.forEach(System.out::println);
        }
    }
}