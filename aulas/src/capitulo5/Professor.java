package capitulo5;

public class Professor {

    String nome;
    long matricula;
    int idade;

    //ações
    public void imprimir() {
        System.out.println("nome do professor: " + nome);
        System.out.println("idade: " + idade);
        System.out.println("matricula: " + matricula);
    }
}
