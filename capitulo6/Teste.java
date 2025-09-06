package capitulo6;

public class Teste {

    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setNome("Alex");
        Cliente.testeStatico = "teste";

        Cliente cliente2 = new Cliente();
        cliente.setNome("Maria");

        Cliente.setTesteStatico("teste de metedo statico");
        System.out.println(cliente.getNome());
    }
}
