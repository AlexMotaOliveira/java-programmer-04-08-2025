package capitulo4;

public class Lab1 {

    public static void main(String[] args) {

        int numero = 10;
        int divisor = 1;
        int contador = 0;

        while (divisor <= numero) {

            if (numero % divisor == 0){
                contador++;
            }

            if (contador > 2){
                break;
            }
            divisor++;
        }

        if (contador > 2 || numero <= 1){
            System.out.println("o numero " + numero  + " não é primo");
        }else {
            System.out.println("o numero " + numero  + " é primo");
        }
    }
}
