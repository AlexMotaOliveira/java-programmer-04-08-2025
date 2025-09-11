package capitulo15;

public class TesteEquals {

    public static void main(String[] args) {

        // comparando tipos primitivos.
        boolean comparativoInt = 10 == 10;
        boolean comparativoChar = 'c' == 'c';
        boolean comparativoString = "igual" == "igual";

        Cliente cliente1 = new Cliente("Alex", "12345678912", "123123");
        Cliente cliente2 = new Cliente("Alex", "12345678912", "123123");
        Cliente cliente3 = cliente1;

        boolean comparativoObjetos = cliente1 == cliente2;
        boolean comparativoObjetos2 = cliente1.equals(cliente2);
        boolean comparativoObjetos3 = cliente3 == cliente1;
        boolean comparativoObjetos4 = cliente3.equals(cliente1);
        boolean comparativoObjetos5 = cliente3.equals("teste de objeto");


        System.out.println();



    }
}
