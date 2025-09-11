package capitulo19.cap19lab1.br.com.impacta.java.repository;

import capitulo19.cap19lab1.br.com.impacta.java.errors.FuncionarioError;
import capitulo19.cap19lab1.br.com.impacta.java.errors.FuncionarioNotFound;
import capitulo19.cap19lab1.br.com.impacta.java.model.Funcionario;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class FuncionarioRepositoryImplementacao implements FuncionarioRepository {

    @Override
    public Funcionario bucarId(int idFuncionario) {
        Connection mysql = ConexaoMysql.getConexao();
        try {
            Statement statement = mysql.createStatement();

            String query = "SELECT * FROM impacta.funcionarios WHERE id =" + idFuncionario;
            ResultSet resultSet = statement.executeQuery(query);

            Funcionario Funcionario = null;
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String nome = resultSet.getString("nome");
                double salario = resultSet.getDouble("salario");
                int cargoid = resultSet.getInt("cargoid");
                Funcionario = new Funcionario(id, nome, salario, cargoid);
            }
            return Funcionario;
        } catch (SQLException e) {
            throw new FuncionarioNotFound("Erro ao consultar um Funcionario", e);
        } finally {
            closeConnection(mysql);
        }
    }

    @Override
    public List<Funcionario> buscarTodos() {
        Connection mysql = ConexaoMysql.getConexao();
        try {
            Statement statement = mysql.createStatement();

            String query = "SELECT * FROM impacta.funcionarios";
            ResultSet resultSet = statement.executeQuery(query);

            List<Funcionario> funcionarios = new ArrayList<>();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String nome = resultSet.getString("nome");
                double salario = resultSet.getDouble("salario");
                int cargoid = resultSet.getInt("cargoid");
                funcionarios.add(new Funcionario(id, nome, salario, cargoid));
            }
            return funcionarios;
        } catch (SQLException e) {
            throw new FuncionarioError("Erro ao buscar uma lista de Funcionarios", e);
        } finally {
            closeConnection(mysql);
        }
    }

    @Override
    public Funcionario salvar(Funcionario Funcionario) {
        Connection mysql = ConexaoMysql.getConexao();
        try {
            String query = "INSERT INTO impacta.funcionarios (nome, salario, cargoid)  VALUES (?,?,?)";
            PreparedStatement preparedStatement = mysql.prepareStatement(query);

            preparedStatement.setString(1, Funcionario.getNome());
            preparedStatement.setDouble(2, Funcionario.getSalario());
            preparedStatement.setInt(3, Funcionario.getCargoId());

            int status = preparedStatement.executeUpdate();
            if (status > 0) {
                System.out.println("Funcionario salvo no mysql");
            }

            return null; // TODO ajustar o retorno nulo
        } catch (SQLException e) {
            throw new FuncionarioError("Erro ao persistir um Funcionario", e);
        } finally {
            closeConnection(mysql);
        }
    }

    @Override
    public Funcionario atualizar(Funcionario Funcionario) {
        return null;
    }

    @Override
    public boolean excluirId(int idFuncionario) {
        Connection mysql = ConexaoMysql.getConexao();
        try {
            String query = "DELETE FROM impacta.funcionarios WHERE id = (?)";
            PreparedStatement preparedStatement = mysql.prepareStatement(query);

            preparedStatement.setInt(1, idFuncionario);

            int status = preparedStatement.executeUpdate();
            return status > 0 ? true : false;
        } catch (SQLException e) {
            throw new FuncionarioError("Erro excluir um Funcionario", e);
        } finally {
            closeConnection(mysql);
        }
    }



    @Override
    public List<Funcionario> buscarPorNome(String nome) {
        Connection mysql = ConexaoMysql.getConexao();
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
            throw new FuncionarioError("Erro ao buscar uma lista de Funcionarios", e);
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
}
