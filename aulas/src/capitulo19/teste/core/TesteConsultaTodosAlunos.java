package capitulo19.teste.core;

import capitulo19.teste.repository.AlunoRepository;
import capitulo19.teste.repository.AlunoRepositoryImplementacao;

public class TesteConsultaTodosAlunos {

    public static void main(String[] args) {

        AlunoRepository repository = new AlunoRepositoryImplementacao();

        repository
                .buscarTodos()
                .forEach(System.out::println);

        System.out.println("-----------------------------------");

        repository
                .buscarTodos()
                .stream()
                .filter(aluno -> {
                    return aluno.getNome().contains("i") || aluno.getNome().startsWith("I");
                })
                .forEach(System.out::println);
    }
}
