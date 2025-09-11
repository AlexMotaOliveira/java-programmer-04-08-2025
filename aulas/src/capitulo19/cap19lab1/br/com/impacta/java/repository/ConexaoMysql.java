package capitulo19.cap19lab1.br.com.impacta.java.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class ConexaoMysql {

    static Connection getConexao() {
        try {
            String desabilitaSSL = "useSSL=false";
            String defineTimeZone = "serverTimezone=UTC";
            String url = "jdbc:mysql://localhost:3306/impacta?" + desabilitaSSL + "&" + defineTimeZone;
            String user = "root";
            String password = "Imp@ct@";

            Connection connection =
                    DriverManager.getConnection(url, user, password);
            return connection;
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("falha na conexão com o mysql");
        }
    }

}
