package capitulo19;

import java.sql.*;

public class TesteConnector {

    public static void main(String[] args) {
        try {

            String desabilitaSSL = "useSSL=false";
            String defineTimeZone = "serverTimezone=UTC";
            String url = "jdbc:mysql://localhost:3306/impacta?" + desabilitaSSL + "&" + defineTimeZone;
//                    "&user=root&password=Imp@ct@";
            String user = "root";
            String password = "Imp@ct@";

            Connection connection =
                    DriverManager.getConnection(url, user, password);
            System.out.println("conectado no banco");

            Statement statement = connection.createStatement();

            String query = "select * from impacta.aluno where idaluno = 2";
            boolean status = statement.execute(query);
            System.out.println("status consulta: " + status);

            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()){
                System.out.println("idaluno: " + resultSet.getInt("idaluno"));
                System.out.println("nome: " + resultSet.getString("nome"));
                System.out.println("datanascimento: " + resultSet.getString("datanascimento"));
                System.out.println("cpf: " + resultSet.getString("cpf"));
            }
            System.out.println(" fim da execução do Select");

            String queryInto = "INSERT INTO impacta.aluno (NOME, DATANASCIMENTO, CPF)  " +
                                        "values ('Josefina', '10/05/1991', '32374196299');";

            boolean statusinsercao = statement.execute(queryInto);
            System.out.println(statusinsercao);

            String querySelect = "select * from impacta.aluno where idaluno = 8";
            ResultSet resultSetInto = statement.executeQuery(querySelect);

            while (resultSetInto.next()){
                System.out.println("idaluno: " + resultSetInto.getInt("idaluno"));
                System.out.println("nome: " + resultSetInto.getString("nome"));
                System.out.println("datanascimento: " + resultSetInto.getString("datanascimento"));
                System.out.println("cpf: " + resultSetInto.getString("cpf"));
            }

            System.out.println(" fim da execução Insert Into");

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }
}
