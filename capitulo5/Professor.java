package capitulo5;

public class Professor {

    String nome;
    long matricula;
    int idade;

    //a��es
    public void imprimir() {
        System.out.println("nome do professor: " + nome);
        System.out.println("idade: " + idade);
        System.out.println("matricula: " + matricula);
    }
}
