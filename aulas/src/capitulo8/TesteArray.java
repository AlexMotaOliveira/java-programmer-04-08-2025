package capitulo8;

import capitulo7.Produto;

public class TesteArray {

    public static void main(String[] args) {
        //posições    0   1  2  3  4  5  6  7  8  9  10
        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        int[] lista = new int[9];
        String[] listaString = new String[10];

        int posicaoZero = array[0];
        int posicaoUm = array[1];
        int posicaoDois = array[2];
        int posicaoTres = array[3];
        int posicaoQuatro = array[4];
        int posicaoCinco = array[5];
        int posicaoSeis = array[6];
        int posicaoSete = array[7];
        int posicaoOito = array[8];
        int posicaoNove = array[9];
        int posicaoDez = array[10];

//        System.out.println(array[0]);

        int contador = 0;

        System.out.println("--- while ----");
        while (contador < array.length) {
            System.out.println("posição: " + contador +
                    ", elemento: " + array[contador]);
            contador++;
        }

        System.out.println("--- for ----");
        // acesso as posições para pegar os elementos
        for (int posicao = 0; posicao < array.length; posicao++) {
            System.out.println("posição: " + posicao +
                    ", elemento: " + array[posicao]);
        }

        System.out.println("--- foreach ----");
        // já acessa os elementos/ os valores do array
        for (int elemento : array) {
            System.out.println("elemento: " + elemento);
        }

        Produto[] produtos = new Produto[2]; // qauntidade de posições
        produtos[0] = new Produto();
        produtos[0].setNome("Coca-Cola");
        produtos[0].setTipo("Refrigerante");

        produtos[1] = new Produto("suco", "laranja");

        for (Produto produto: produtos) {
            produto.imprimir();
        }

        Produto produto1 = new Produto("suco", "Abacaxi");
        Produto produto2 = new Produto("suco", "Laranja");
        Produto produto3 = new Produto("suco", "Açai");
        Produto[] produtos1 = {produto1, produto2, produto3};

        for(Produto elemento: produtos1){
            elemento.imprimir();
        }

        int variavel;
        variavel = 10;

        int[] array2 = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0};

        int[] listanumeros = new int[3];
        listanumeros[0] = 1;
        listanumeros[1] = 2;
        listanumeros[2] = 3;
//        listanumeros = {10,20,30};

        int[] listanumeros2;
        listanumeros2 = new int[]{1,2,3};

    }
}
