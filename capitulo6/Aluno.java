package capitulo6;

public class Aluno {

    public static int contadorDeAlunos;

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void imprimir(){
        System.out.println("nome: " + this.nome);
        System.out.println("contador: " +
                this.contadorDeAlunos);
        System.out.println();
    }
}
