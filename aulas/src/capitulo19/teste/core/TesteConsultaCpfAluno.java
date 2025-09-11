package capitulo19.teste.core;

import capitulo19.teste.model.Aluno;
import capitulo19.teste.repository.AlunoRepository;
import capitulo19.teste.repository.AlunoRepositoryImplementacao;

public class TesteConsultaCpfAluno {

    public static void main(String[] args) {

        AlunoRepository repository = new AlunoRepositoryImplementacao();

        Aluno aluno = repository.buscarCpf("62174185299");
        if (aluno != null){
            System.out.println(aluno.toString());
        }

    }
}
