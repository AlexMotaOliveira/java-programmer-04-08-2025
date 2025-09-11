package capitulo6;

public class Calculadora {

    int valor4 = 10;
    int valor5;
    String mensagem;

    public int somar(int valor1, int valor2) {
        int resultado = valor1 + valor2;
        return resultado;
    }

    //sobrecarga - metodos com o mesmo nome,
    // mas assinatura diferente na mesma classe
    public long somar(long valor1, long valor2) {
        long resultado = valor1 + valor2;
        return resultado;
    }

    public double somar(double valor1, double valor2) {
        return valor1 + valor2;
    }

    public int subtrair(int valor1, int valor2) {
        return valor1 - valor2;
    }

    public double subtrair(double valor1, double valor2) {
        return valor1 - valor2;
    }

    public double subtrair(double valor1, int valor2) {
        return valor1 - valor2;
    }

    public double subtrair(int valor1, double valor2) {
        return valor1 - valor2;
    }

    public int multiplicar(int valor1, int valor2) {
        return valor1 * valor2;
    }

    public int dividir(int valor1, int valor2){
        return valor1 / valor2;
    }


    public void imprimirAlgo(String msg) {
        println(msg);
    }

    public void imprimirOutroAlgo(String msg) {

        println("outro: metodo" + msg);
    }

    private void println(String msg) {
        System.out.println(msg);
    }
}
