package capitulo5.cap5lab1;

public class Funcionario {

    String nome;
    String sobrenome;
    String cargo;
    double salario;

    public void imprimir(){
        System.out.println("sobrenome: " + sobrenome);
        System.out.println("cargo: " + cargo);
        System.out.println("salario: " + salario);
    }
}
