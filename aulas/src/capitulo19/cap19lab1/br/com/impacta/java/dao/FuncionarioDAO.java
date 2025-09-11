package capitulo19.cap19lab1.br.com.impacta.java.dao;

import capitulo19.cap19lab1.br.com.impacta.java.model.Funcionario;
import capitulo19.teste.errors.AlunoError;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class FuncionarioDAO {


    public Funcionario persist(Funcionario funcionario) throws DAOException {
        Connection mysql = this.getConexao();
        try {
            String query = "INSERT INTO impacta.funcionarios (nome, salario, cargoid)  VALUES (?,?,?)";
            PreparedStatement preparedStatement = mysql.prepareStatement(query);

            preparedStatement.setString(1, funcionario.getNome());
            preparedStatement.setDouble(2, funcionario.getSalario());
            preparedStatement.setInt(3, funcionario.getCargoId());

            int status = preparedStatement.executeUpdate();
            if (status > 0) {
                System.out.println("funcionario salvo no mysql");
            }

            return null; //TODO ajustar o retorno que esta nulo
        } catch (SQLException e) {
            throw new DAOException("Falha ao salvar dados do funcionário", e);
        } finally {
            closeConnection(mysql);
        }
    }

    public List<Funcionario> findByName(String nome) throws DAOException {
        Connection mysql = this.getConexao();
        try {

            String query = "SELECT * FROM impacta.funcionarios WHERE nome LIKE \"%" + nome + "%\"";
            PreparedStatement statement = mysql.prepareStatement(query);

            ResultSet resultSet = statement.executeQuery(query);

            List<Funcionario> funcionarios = new ArrayList<>();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String nome_ = resultSet.getString("nome");
                double salario = resultSet.getDouble("salario");
                int cargoid = resultSet.getInt("cargoid");
                funcionarios.add(new Funcionario(id, nome_, salario, cargoid));
            }
            return funcionarios;
        } catch (SQLException e) {
            throw new DAOException("Erro ao buscar uma lista de alunos", e);
        } finally {
            closeConnection(mysql);
        }
    }


    public boolean excluirId(int cargoId) {
        Connection mysql = this.getConexao();
        try {
            String query = "DELETE FROM impacta.funcionario WHERE cargoid = (?)";
            PreparedStatement preparedStatement = mysql.prepareStatement(query);

            preparedStatement.setInt(1, cargoId);

            int status = preparedStatement.executeUpdate();
            return status > 0 ? true : false;
        } catch (SQLException e) {
            throw new AlunoError("Erro excluir um aluno", e);
        } finally {
            closeConnection(mysql);
        }
    }


    private void closeConnection(Connection connection) {
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private Connection getConexao() {
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
