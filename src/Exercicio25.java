import java.sql.*;

record Cliente(int id, String nome) {}

interface ClienteDao {
    Cliente buscarPorId(int id) throws SQLException;
}

class ClienteDaoJdbc implements ClienteDao {
    private final Connection con;

    public ClienteDaoJdbc(Connection con) {
        this.con = con;
    }

    @Override
    public Cliente buscarPorId(int id) throws SQLException {
        String sql = "SELECT id, nome FROM cliente WHERE id = ?";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                return rs.next() ? new Cliente(rs.getInt("id"), rs.getString("nome")) : null;
            }
        }
    }
}

public class Exercicio25 {
    public static void main(String[] args) {
        System.out.println("Estrutura DAO definida com sucesso.");
    }
}