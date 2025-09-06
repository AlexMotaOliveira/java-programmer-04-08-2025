package capitulo8;

public class TesteArrayBidimensional {

    public static void main(String[] args) {

        int[][] bidmiensional = new int[3][3];

        bidmiensional[0][0] = 10;
        bidmiensional[0][1] = 56;
        bidmiensional[0][2] = 15;

        bidmiensional[1][0] = 32;
        bidmiensional[1][1] = 2;
        bidmiensional[1][2] = 3;

        bidmiensional[2][0] = 1;
        bidmiensional[2][1] = 1;
        bidmiensional[2][2] = 1;

        for (int coluna = 0; coluna < bidmiensional.length; coluna++) {
            for (int linha = 0; linha < bidmiensional[coluna].length; linha++) {
                System.out.print("coluna: " + coluna);
                System.out.println(" linha: " + linha +
                        " elemento: " + bidmiensional[coluna][linha]);
            }
        }

        int[][] bidmiensional2 =
                {
                        {1, 10, 15},
                        {2, 2, 8, 9},
                        {3}
                };

        //foreach
        for (int[] coluna: bidmiensional2){
            for (int elemento: coluna){
                System.out.print(elemento + " ");
            }
            System.out.println();
        }

    }
}
