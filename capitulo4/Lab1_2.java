package capitulo4;

public class Lab1_2 {

    public static void main(String[] args) {

        int numero = 11;
        int contador = 0;

        for (int divisor = 1; divisor <= numero; divisor++) {
            if (numero % divisor == 0) {
                contador++;
            }

            if (contador > 2) {
                break;
            }
        }

        if (contador > 2 || numero <= 1){
            System.out.println("o numero " + numero  + " não é primo");
        }else {
            System.out.println("o numero " + numero  + " é primo");
        }
    }
}
