package capitulo9.cap9Lab1;

public class Professor extends Pessoa {


    private float salario;
    private String disciplina;

    public Professor(String nome, int idade, char sexo, int numeroRg,
                     String dataNasc, float salario, String disciplina) {
        super(nome, idade, sexo, numeroRg, dataNasc);
        this.salario = salario;
        this.disciplina = disciplina;
    }

    public Professor(String nome, int idade, char sexo, RG rg,
                     float salario, String disciplina) {
        super(nome, idade, sexo, rg);
        this.salario = salario;
        this.disciplina = disciplina;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    @Override
    public void falar(String fala) {
        System.out.println(super.getNome() + fala);
    }

    @Override
    public void mostrarDados() {
        System.out.println(" --- Professor ----");
        System.out.println("nome: " + super.getNome());
        System.out.println("idade: " + super.getIdade());
        System.out.println("sexo: " + super.getSexo());
        System.out.println("rg-numero :" + super.getRg().getNumero());
        System.out.println("rg-dataNacimento: " + super.getRg().getDataNasc());
        System.out.println("disciplina: " + this.getDisciplina());
        System.out.println("salario: " + this.getSalario());
        System.out.println();
    }
}
