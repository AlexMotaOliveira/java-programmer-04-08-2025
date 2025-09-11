package capitulo4;

public class EstruturaRepeticaoWhile {

    public static void main(String[] args) {

        int contador = 12;
        //primeiro ele valida a condição
        while (contador < 10) {
            System.out.println("contador esta no numero: " + contador);
            contador = contador + 1;
        }

        int contador2 = 12;
        // executa primeiro e depois valida a condição
        do {
            System.out.println("contador esta no numero: " + contador2);
            contador2++;
        } while (contador2 < 10);
    }
}

