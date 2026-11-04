import java.sql.*;

public class Exercicio16 {
    record Produto(int id, String nome, double preco) {}

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/loja";
        String sql = "SELECT id, nome, preco FROM produto WHERE id = ?";

        try (Connection con = DriverManager.getConnection(url, "app", "senha");
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, 1);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    Produto p = new Produto(
                            rs.getInt("id"),
                            rs.getString("nome"),
                            rs.getDouble("preco")
                    );
                    System.out.println("Produto mapeado: " + p);
                } else {
                    System.out.println("Produto não encontrado.");
                }
            }
        } catch (SQLException e) {
            System.err.println("Erro na consulta: " + e.getMessage());
        }
    }
}