package capitulo7.Cap7Lab1;

public class Cadastro {

    private String nome;
    private String sobreNome;
    private int idade;

    Cadastro(){
    }

    Cadastro(String nome, String sobreNome){
        this.nome = nome;
        this.sobreNome = sobreNome;
    }

    Cadastro(String nome, String sobreNome, int idade){
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void mostrar(){
        System.out.println("Nome: " + nome);
        System.out.println("Sobrenome: " + sobreNome);
        System.out.println("Idade: " + idade);
        System.out.println();
    }
}
