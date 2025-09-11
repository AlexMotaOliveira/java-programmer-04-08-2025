package capitulo6;

public class TesteCaculadora {

    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();
    //  int resultadoSoma =   10 - 20
        int resultadoSoma = calculadora.somar(10 , 20);

//        System.out.println("soma dos valores: " + resultadoSoma);
        System.out.println("soma dos valores: "
                + calculadora.somar(10 , 20));

       calculadora.imprimirAlgo("Ola, " +
               "sou um metodo void");
       calculadora.imprimirOutroAlgo("outra " +
               "impressao");

    }
}
