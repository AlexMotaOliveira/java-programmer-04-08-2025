package capitulo6;

public class Cap6_Lab3 {

    public static void main(String[] args) {

        Aluno joao = new Aluno();
        joao.setNome("Joao");
        joao.contadorDeAlunos += 1;
        joao.imprimir();

        Aluno maria = new Aluno();
        maria.setNome("Maria");
        maria.contadorDeAlunos = maria.contadorDeAlunos + 1;
        maria.imprimir();

        Aluno marcos = new Aluno();
        marcos.setNome("Marcos");
        marcos.contadorDeAlunos++;
        marcos.imprimir();

    }
}
