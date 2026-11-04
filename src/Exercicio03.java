import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;

public class Exercicio03 {
    public static void main(String[] args) throws IOException {
        Path pasta = Path.of("dados", "alunos");
        Files.createDirectories(pasta);
        System.out.println("Diretórios criados com sucesso: " + Files.exists(pasta));
    }
}