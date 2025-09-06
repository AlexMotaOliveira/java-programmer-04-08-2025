package capitulo4;

public class EstruturaRepeticoFor {

    public static void main(String[] args) {

        int ano = 1930;
        //crias uma variavel    ; validação     ; incrementar
        for (int contador = 2025; ano < contador; ano +=4) {
            if (ano != 1942 && ano != 1946) {
                System.out.println("Copa do Mundo de " + ano);
            }
        }


        //crias uma variavel    ; validação     ; incrementar
        for (int contador = 2025; ano < contador; ano +=4) {
            if (ano == 1942 || ano == 1946) {
                continue;
            }
            System.out.println("Copa do Mundo de " + ano);
        }
    }
}
