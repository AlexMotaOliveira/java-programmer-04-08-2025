package capitulo9;

import java.beans.Transient;

public class Teste {


    public static void main(String[] args) {

        Professor professor = new Professor("Programacao em java");
        professor.setFuncional("IP202501");
        professor.setNome("Alex Oliveira");
        professor.setEmail("alex@alex.com");
        professor.imprimir();
        professor.salario();
        professor.mostrar();

        Professor professor1 =
                new Professor("IP202502", "Jão Silva",
                        "jao@jao", "Excel basico");
        professor1.imprimir();

        Funcionario funcionario = new Professor("logica de programação");
        Professor professor2 = (Professor)funcionario;
        professor2.getMateria();

        ((Professor)funcionario).imprimir();

        Funcionario funcionario1 = new Funcionario();



    }
}
