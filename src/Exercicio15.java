import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Exercicio15 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/loja";
        String sql = "INSERT INTO cliente (nome, email) VALUES (?, ?)";

        try (Connection con = DriverManager.getConnection(url, "app", "senha");
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, "Carlos Silva");
            ps.setString(2, "carlos@exemplo.com");

            int linhasAfetadas = ps.executeUpdate();
            System.out.println("Cliente inserido com sucesso. Linhas afetadas: " + linhasAfetadas);

        } catch (SQLException e) {
            System.err.println("Erro ao inserir: " + e.getMessage());
        }
    }
}