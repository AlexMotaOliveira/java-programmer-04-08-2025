package br.com.impacta.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class ConexaoRepository {

    static Connection getConexao() throws SQLException {

        String desabilitaSSL = "useSSL=false";
        String defineTimeZone = "serverTimezone=UTC";
        String url = "jdbc:mysql://localhost:3306/cadastro?" + desabilitaSSL + "&" + defineTimeZone;
        String usuario = "root";
        String senha = "Imp@ct@";

        Connection connection =
                DriverManager.getConnection(url, usuario, senha);
        return connection;

    }
}
