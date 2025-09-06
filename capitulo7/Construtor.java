package capitulo7;

public class Construtor {

    public static void main(String[] args) {

        Produto produto = new Produto(); // construtor padrão
//        produto.tipo =  "bebida";
        produto.setTipo("bebida");
        produto.setNome("red bull");
        String tipo = produto.getTipo();
        System.out.println(produto.getTipo());

        Produto produto1 = new Produto("refrigerante", "coca-cola");
        System.out.println(produto1);
    }
}
