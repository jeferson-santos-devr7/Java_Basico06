import java.sql.*;

public class Exercicio24 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/loja";

        try (Connection con = DriverManager.getConnection(url, "app", "senha");
             PreparedStatement ps = con.prepareStatement("INSERT INTO categoria (nome) VALUES (?)")) {

            con.setAutoCommit(false);
            for (int i = 1; i <= 100; i++) {
                ps.setString(1, "Categoria Lote " + i);
                ps.addBatch(); // Acumula no lote
            }

            ps.executeBatch(); // Envia tudo de uma vez
            con.commit();
            System.out.println("100 registros inseridos via Batch com sucesso!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}