import java.sql.*;

public class Exercicio23 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/loja";

        try (Connection con = DriverManager.getConnection(url, "app", "senha")) {
            con.setAutoCommit(false); // Inicia transação manual

            try (PreparedStatement ps1 = con.prepareStatement("INSERT INTO pedido (cliente_id) VALUES (?)")) {
                ps1.setInt(1, 1);
                ps1.executeUpdate();

                // Simulando erro proposital para forçar rollback
                if (true) {
                    throw new SQLException("Erro simulado no item do pedido!");
                }

                con.commit();
                System.out.println("Transação confirmada com sucesso.");
            } catch (SQLException e) {
                con.rollback(); // Desfaz a operação em caso de erro
                System.out.println("Rollback executado com sucesso devido a: " + e.getMessage());
            } finally {
                con.setAutoCommit(true);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}