import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Exercicio14 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/loja";
        String user = "app";
        String pass = "senha";

        try (Connection con = DriverManager.getConnection(url, user, pass)) {
            DatabaseMetaData meta = con.getMetaData();
            System.out.println("Produto do Banco: " + meta.getDatabaseProductName());
            System.out.println("Versão do Banco: " + meta.getDatabaseProductVersion());
        } catch (SQLException e) {
            System.err.println("Erro na conexão com MySQL: " + e.getMessage());
        }
    }
}