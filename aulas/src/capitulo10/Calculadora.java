package capitulo10;

public class Calculadora implements Soma, Subtrai {

    @Override
    public int somar(int valor1, int valor2) {
        return valor1 + valor2;
    }


    @Override
    public int subtrair(int valor1, int valor2) {
        return valor1 - valor2;
    }
}
