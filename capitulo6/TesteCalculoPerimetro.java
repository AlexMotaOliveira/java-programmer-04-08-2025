package capitulo6;

public class TesteCalculoPerimetro {

    //private
    //public
    //protected
    //default
    public static void main(String[] args) {

        final double area = 2;
        final double raio = 3;

        double perimetro = area * raio * Trigonometria.PI;

        System.out.println("valor do perimetro: " + perimetro);
    }
}
