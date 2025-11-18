import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ListarUsuarios {

    public static void listar() {
        String sql = "SELECT * FROM usuarios";

        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                System.out.println(
                    rs.getInt("id") + " - " + 
                    rs.getString("nome") + " - " +
                    rs.getInt("idade")
                );
            }

        } catch (Exception e) {
            System.out.println("Erro ao listar: " + e.getMessage());
        }
    }
}
