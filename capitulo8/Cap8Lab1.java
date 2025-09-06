package capitulo8;

public class Cap8Lab1 {

    public static int maiorNumero(int[] array) {

        int maiorNumero = 0;
        for (int numero : array) {
            if (numero > maiorNumero) {
                maiorNumero = numero;
            }
        }

        return maiorNumero;
    }

    public static void main(String[] args) {

        int[] numeros = {1, 5, 8, 300, 40, 66};
        int maiorNumero = maiorNumero(numeros);

        for (int numero: numeros){
            System.out.print(numero + " - ");
        }
        System.out.println();
        System.out.println("maior numero do array: " + maiorNumero);
    }
}
