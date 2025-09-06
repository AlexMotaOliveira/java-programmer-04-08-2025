package capitulo19.teste.repository;

import capitulo19.teste.model.Aluno;
import capitulo19.teste.errors.AlunoError;
import capitulo19.teste.errors.AlunoNotFound;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AlunoRepositoryImplementacao implements AlunoRepository {

    @Override
    public Aluno bucarId(int idAluno) {
        Connection mysql = ConexaoMysql.getConexao();
        try {
            Statement statement = mysql.createStatement();

            String query = "SELECT * FROM impacta.aluno WHERE idaluno =" + idAluno;
            ResultSet resultSet = statement.executeQuery(query);

            Aluno aluno = null;
            while (resultSet.next()) {
                int idaluno = resultSet.getInt("idaluno");
                String nome = resultSet.getString("nome");
                String dataNacimento = resultSet.getString("datanascimento");
                String cpf = resultSet.getString("cpf");
                aluno = new Aluno(idaluno, nome, dataNacimento, cpf);
            }
            return aluno;
        } catch (SQLException e) {
            throw new AlunoNotFound("Erro ao consultar um aluno", e);
        } finally {
            closeConnection(mysql);
        }
    }

    @Override
    public List<Aluno> buscarTodos() {
        Connection mysql = ConexaoMysql.getConexao();
        try {
            Statement statement = mysql.createStatement();

            String query = "SELECT * FROM impacta.aluno";
            ResultSet resultSet = statement.executeQuery(query);

            List<Aluno> alunos = new ArrayList<>();
            while (resultSet.next()) {
                int idaluno = resultSet.getInt("idaluno");
                String nome = resultSet.getString("nome");
                String dataNacimento = resultSet.getString("datanascimento");
                String cpf = resultSet.getString("cpf");
                alunos.add(new Aluno(idaluno, nome, dataNacimento, cpf));
            }
            return alunos;
        } catch (SQLException e) {
            throw new AlunoError("Erro ao buscar uma lista de alunos", e);
        } finally {
            closeConnection(mysql);
        }
    }

    @Override
    public Aluno salvar(Aluno aluno) {
        Connection mysql = ConexaoMysql.getConexao();
        try {
            String query = "INSERT INTO impacta.aluno (nome, datanascimento, cpf)  VALUES (?,?,?)";
            PreparedStatement preparedStatement = mysql.prepareStatement(query);

            preparedStatement.setString(1, aluno.getNome());
            preparedStatement.setString(2, aluno.getDataNascimento());
            preparedStatement.setString(3, aluno.getCpf());

            int status = preparedStatement.executeUpdate();
            if (status > 0) {
                System.out.println("aluno salvo no mysql");
            }

            return null;
        } catch (SQLException e) {
            throw new AlunoError("Erro ao persistir um aluno", e);
        } finally {
            closeConnection(mysql);
        }
    }

    @Override
    public Aluno atualizar(Aluno aluno) {
        return null;
    }

    @Override
    public boolean excluirId(int idAluno) {
        Connection mysql = ConexaoMysql.getConexao();
        try {
            String query = "DELETE FROM impacta.aluno WHERE idaluno = (?)";
            PreparedStatement preparedStatement = mysql.prepareStatement(query);

            preparedStatement.setInt(1, idAluno);

            int status = preparedStatement.executeUpdate();
            return status > 0 ? true : false;
        } catch (SQLException e) {
            throw new AlunoError("Erro excluir um aluno", e);
        } finally {
            closeConnection(mysql);
        }
    }

    @Override
    public Aluno buscarCpf(String cpf) {
        Connection mysql = ConexaoMysql.getConexao();
        try {
            Statement statement = mysql.createStatement();

            String query = "SELECT * FROM impacta.aluno WHERE cpf =" + cpf;
            ResultSet resultSet = statement.executeQuery(query);

            Aluno aluno = null;
            while (resultSet.next()) {
                int idaluno = resultSet.getInt("idaluno");
                String nome = resultSet.getString("nome");
                String dataNacimento = resultSet.getString("datanascimento");
                String cpfEntity = resultSet.getString("cpf");
                aluno = new Aluno(idaluno, nome, dataNacimento, cpfEntity);
            }
            return aluno;
        } catch (SQLException e) {
            throw new AlunoNotFound("Erro ao consultar um aluno", e);
        } finally {
            closeConnection(mysql);
        }
    }

    @Override
    public List<Aluno> buscarPorNome(String nome) {
        Connection mysql = ConexaoMysql.getConexao();
        try {

            String query = "SELECT * FROM impacta.aluno WHERE nome LIKE \"%" + nome +"%\"";
            PreparedStatement statement = mysql.prepareStatement(query);

            ResultSet resultSet = statement.executeQuery(query);

            List<Aluno> alunos = new ArrayList<>();
            while (resultSet.next()) {
                int idaluno = resultSet.getInt("idaluno");
                String nome_ = resultSet.getString("nome");
                String dataNacimento = resultSet.getString("datanascimento");
                String cpf = resultSet.getString("cpf");
                alunos.add(new Aluno(idaluno, nome_, dataNacimento, cpf));
            }
            return alunos;
        } catch (SQLException e) {
            throw new AlunoError("Erro ao buscar uma lista de alunos", e);
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
