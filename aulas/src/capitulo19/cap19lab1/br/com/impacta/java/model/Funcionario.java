package capitulo19.cap19lab1.br.com.impacta.java.model;

public class Funcionario {

    private int id;
    private String nome;
    private Double salario;
    private int cargoId;

    public Funcionario(){

    }

    public Funcionario(int id, String nome, Double salario, int cargoId) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
        this.cargoId = cargoId;
    }

    public Funcionario(String nome, Double salario, int cargoId) {
        this.nome = nome;
        this.salario = salario;
        this.cargoId = cargoId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public int getCargoId() {
        return cargoId;
    }

    public void setCargoId(int cargoId) {
        this.cargoId = cargoId;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", salario=" + salario +
                ", cargoId=" + cargoId +
                '}';
    }
}
