package capitulo10;

public class TesteCalculadora {


    public static final int VALOR_2 = 10;

    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        double resultadoDouble = calculadora.somar(10l, 20l);
        System.out.println(resultadoDouble);

        int somar = calculadora.somar(10, 20);
        System.out.println(somar);


        int minhaVariavel = calculadora.subtrair(10, VALOR_2);
        System.out.println(minhaVariavel);


        Soma.somar(10D, 15D);


    }
}
