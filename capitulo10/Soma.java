package capitulo10;

// toda interface já abstrata, não precisa do abstract
public abstract interface Soma {

    // sempre vai ser statico e publico, não precisa add os modificadores
    public static int valor = 10;

    // sempre vai ser publico, não precisa add os modificadores
    public int somar(int valor1, int valor2);

    public static double somar(double valor1, double valor2) {
        return valor1 + valor2;
    }

    default long somar(long valor1, long valor2) {
        return valor1 + valor2;
    }

}
