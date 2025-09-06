package capitulo19.teste.core;

import capitulo19.teste.repository.AlunoRepository;
import capitulo19.teste.repository.AlunoRepositoryImplementacao;

public class TesteExcluiAluno {

    public static void main(String[] args) {

        AlunoRepository repository = new AlunoRepositoryImplementacao();
        boolean status = repository.excluirId(11);
        if (status){
            System.out.println("aluno foi excluido");
        }
    }
}
