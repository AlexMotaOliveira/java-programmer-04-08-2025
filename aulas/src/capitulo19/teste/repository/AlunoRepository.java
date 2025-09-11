package capitulo19.teste.repository;

import capitulo19.teste.model.Aluno;

import java.util.List;

public interface AlunoRepository {

    Aluno bucarId(int idAluno);
    List<Aluno> buscarTodos();
    List<Aluno> buscarPorNome(String nome);
    Aluno buscarCpf(String cpf);

    Aluno salvar(Aluno aluno);
    Aluno atualizar(Aluno aluno);

    boolean excluirId(int idAluno);


}
