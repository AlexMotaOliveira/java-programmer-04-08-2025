package capitulo4;

public class Lab3 {

    public static void main(String[] args) {

        int ano = 1930;

        while (ano <= 2025) {
            if (ano != 1942 && ano != 1946) {
                System.out.println("Copa do Mundo de " + ano);
            }
            ano = ano + 4;
        }
    }
}
