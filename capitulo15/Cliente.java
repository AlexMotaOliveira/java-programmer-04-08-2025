package capitulo15;

import java.util.Objects;

public class Cliente extends Object {

    private String nome;
    private String cpf;
    private String matricula;

    public Cliente(String nome, String cpf, String matricula) {
        this.nome = nome;
        this.cpf = cpf;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || this.cpf == null) {
            return false;
        }

        if (!(obj instanceof Cliente)){
            return false;
        }

        Cliente objetoCast = (Cliente) obj;
//        return this.cpf.equals(objetoCast.getCpf());
        return this.cpf == objetoCast.getCpf();
    }


    @Override
    public int hashCode() {
        return Objects.hashCode(getCpf());
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", matricula='" + matricula + '\'' +
                '}';
    }
}
