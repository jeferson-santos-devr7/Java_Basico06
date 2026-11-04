import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Exercicio01 {
    public static void main(String[] args) throws IOException {
        Path arquivo = Path.of("teste.txt");
        Files.writeString(arquivo, "Conteúdo gravado com NIO.2!", StandardCharsets.UTF_8);
        String conteudo = Files.readString(arquivo, StandardCharsets.UTF_8);
        System.out.println("Lido do arquivo: " + conteudo);
    }
}