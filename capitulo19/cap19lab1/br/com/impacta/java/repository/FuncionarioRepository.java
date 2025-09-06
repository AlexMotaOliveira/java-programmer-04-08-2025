package capitulo19.cap19lab1.br.com.impacta.java.repository;

import capitulo19.cap19lab1.br.com.impacta.java.model.Funcionario;

import java.util.List;

public interface FuncionarioRepository {

    Funcionario bucarId(int idFuncionario);
    List<Funcionario> buscarTodos();
    List<Funcionario> buscarPorNome(String nome);

    Funcionario salvar(Funcionario funcionario);
    Funcionario atualizar(Funcionario funcionario);

    boolean excluirId(int idFuncionario);


}
