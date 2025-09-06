package capitulo9.teste;

import capitulo9.Funcionario;
import capitulo9.Professor;

public class Teste2 {

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();
//        funcionario.mostrar();

        Professor professor = new Professor("");
//        professor.mostrar();

        Aluno aluno = new Aluno();

//        aluno.mostrar();
        aluno.setNome("Alex");
        aluno.imprimir();

        aluno.imprimir();


        Aluno aluno1 = new Aluno();

        System.out.println(aluno1.toString());

    }
}
