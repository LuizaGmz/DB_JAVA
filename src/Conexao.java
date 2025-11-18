import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {

    public static Connection conectar() {
        try {
            Class.forName("org.sqlite.JDBC");

            String url = "jdbc:sqlite:banco.db";
            Connection conn = DriverManager.getConnection(url);

            System.out.println("Conectado com sucesso!");
            return conn;

        } catch (Exception e) {
            System.out.println("Erro ao conectar: " + e.getMessage());
            return null;
        }
    }
}
