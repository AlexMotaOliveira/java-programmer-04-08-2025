package capitulo14;

@FunctionalInterface
public interface Calculadora {

    double calcular(double valor1, double valor2);

    // não permite mais de um metodo abstrato e permite metodos default

}
