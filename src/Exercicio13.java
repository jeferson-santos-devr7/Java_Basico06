import java.nio.file.*;
import java.io.IOException;

public class Exercicio13 {
    public static void main(String[] args) throws IOException {
        Path origem = Path.of("entrada.txt");
        Path destinoDir = Path.of("processados");
        Files.createDirectories(destinoDir);

        if (Files.exists(origem)) {
            Files.move(origem, destinoDir.resolve(origem.getFileName()), StandardCopyOption.REPLACE_EXISTING);
            System.out.println("Arquivo movido para a pasta de processados.");
        } else {
            System.out.println("Arquivo de entrada não encontrado para mover.");
        }
    }
}