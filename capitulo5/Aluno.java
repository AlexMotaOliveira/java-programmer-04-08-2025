package capitulo5;

public class Aluno {
    // Atributos da classe ou caracteristicas
    public String nome;
    long matricula;
    int idade;
    private String cpf;

    //ações
    public void imprimir() {
        System.out.println("nome do aluno: " + nome);
        System.out.println("idade: " + idade);
        System.out.println("matricula: " + matricula);
}

}
