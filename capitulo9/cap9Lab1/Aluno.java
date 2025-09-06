package capitulo9.cap9Lab1;

import java.awt.*;

//subClasse        extends classe superior
public class Aluno extends Pessoa{

    private float mensalidade;
    private String curso;

    public Aluno(String nome, int idade, char sexo, RG rg,
                 float mensalidade, String curso) {
        super(nome, idade, sexo, rg);
        this.mensalidade = mensalidade;
        this.curso = curso;
    }

    public Aluno(String nome, int idade, char sexo, int numeroRg, String dataNasc,
                 float mensalidade, String curso) {
        super(nome, idade, sexo, numeroRg, dataNasc);
        this.mensalidade = mensalidade;
        this.curso = curso;
    }

    public float getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(float mensalidade) {
        this.mensalidade = mensalidade;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public void falar(String fala) {
        System.out.println(super.getNome() + fala);
    }

    @Override
    public void mostrarDados() {
        System.out.println(" --- Aluno ----");
        System.out.println("nome: " + super.getNome());
        System.out.println("idade: " + super.getIdade());
        System.out.println("sexo: " + super.getSexo());
        System.out.println("rg-numero :" + super.getRg().getNumero());
        System.out.println("rg-dataNacimento: " + super.getRg().getDataNasc());
        System.out.println("curso: " + this.getCurso());
        System.out.println("mensalidade: " + this.getMensalidade());
        System.out.println();
    }
}
