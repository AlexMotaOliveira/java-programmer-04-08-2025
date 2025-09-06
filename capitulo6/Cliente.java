package capitulo6;

public class Cliente {

    static String testeStatico;

    private String nome;
    private String cpf;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static void setTesteStatico(String testeStatico) {
        Cliente.testeStatico = testeStatico;
    }
}
