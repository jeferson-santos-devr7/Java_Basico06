import java.nio.file.*;
import java.io.IOException;

public class Exercicio04 {
    public static void main(String[] args) throws IOException {
        Path origem = Path.of("teste.txt");
        Path backupDir = Path.of("backup");
        Files.createDirectories(backupDir);
        Path destino = backupDir.resolve("teste_backup.txt");

        Files.copy(origem, destino, StandardCopyOption.REPLACE_EXISTING);
        System.out.println("Arquivo copiado para: " + destino.toAbsolutePath());
    }
}