package capitulo14;

@FunctionalInterface
public interface Calculadora {

    double calcular(double valor1, double valor2);

    // n�o permite mais de um metodo abstrato e permite metodos default

}
