import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;

public class Exercicio02 {
    public static void main(String[] args) throws IOException {
        Path arquivo = Path.of("teste.txt");
        if (!Files.exists(arquivo)) {
            Files.writeString(arquivo, "Criando arquivo de teste.");
        }
        System.out.println("Caminho absoluto: " + arquivo.toAbsolutePath());
        System.out.println("Tamanho (bytes): " + Files.size(arquivo));
        System.out.println("Última modificação: " + Files.getLastModifiedTime(arquivo));
    }
}