package capitulo19.teste.core;

import capitulo19.teste.model.Aluno;
import capitulo19.teste.repository.AlunoRepository;
import capitulo19.teste.repository.AlunoRepositoryImplementacao;

public class TesteSalvaAluno {


    public static void main(String[] args) {

        AlunoRepository repository = new AlunoRepositoryImplementacao();
        Aluno aluno = new Aluno("Franscisca", "31/04/2001", "16925814752");

        Aluno alunoRepository = repository.salvar(aluno);

    }
}
