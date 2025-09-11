package capitulo11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteExcessaoVerificada {

    public static void main(String[] args) {

        try {

            Connection connection = conectarNoBancoDeDados();

        }catch (SQLException ex){
            System.out.println("erro de conexão no banco de dados");
            ex.printStackTrace();
        }finally {
            System.out.println("fim do programa");
        }
    }

    public static Connection conectarNoBancoDeDados() throws SQLException{
        return DriverManager.getConnection("SQLServe:local:3030");
    }
}
