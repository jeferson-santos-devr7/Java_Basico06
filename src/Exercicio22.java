import java.sql.*;

public class Exercicio22 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/loja";

        try (Connection con = DriverManager.getConnection(url, "app", "senha")) {
            // CREATE
            try (PreparedStatement ps = con.prepareStatement("INSERT INTO categoria (nome) VALUES (?)")) {
                ps.setString(1, "Eletrônicos");
                ps.executeUpdate();
            }
            System.out.println("Categoria inserida com sucesso!");
        } catch (SQLException e) {
            System.err.println("Erro no CRUD JDBC: " + e.getMessage());
        }
    }
}