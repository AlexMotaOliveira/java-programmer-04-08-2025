package capitulo7;

public class Produto {

    //atributos privados, s�o caracteristicas da classe
    private String tipo;
    private String nome;

    //construtor //criar se for necessario no projeto
    public Produto(){
        //construtor padr�o e default, n�o precisa ser criado
        //a n�o ser que seja criado um construido
    }

    //construtor
    public Produto(String tipo, String nome){
        this.tipo = tipo.toUpperCase();
        this.nome = nome.toUpperCase();
    }

    //criar se for necessario no projeto
    public Produto(String nome){
        this.nome = nome.toUpperCase();
    }

    //metodo
    public String getTipo() {
        return tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome.toUpperCase();
    }

    public void setTipo(String tipo) {
        this.tipo = tipo.toUpperCase();
    }

    public void imprimir(){
        System.out.println(nome);
        System.out.println(tipo);
        System.out.println();
    }
}
