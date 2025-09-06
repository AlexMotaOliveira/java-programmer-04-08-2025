package capitulo8;

public class ArrayTridimensional {

    public static void main(String[] args) {

        int[][][] tridimensional =
                {
                        {{1, 2, 3}, {4, 5, 6}, {7, 5, 9}},
                        {{1, 3}, {4, 8, 7}, {5, 9, 8}},
                        {{25, 58, 6}, {12,}, {125, 96, 12, 5, 4}}
                };


        for (int[][] coluna : tridimensional) {
            for (int[] linha : coluna) {
                for (int elemento : linha) {
                    System.out.print(elemento + " ");
                }
                System.out.print(" - ");
            }
            System.out.println();
        }

        int[][][] tridimensional2 = new int[2][10][15];

        tridimensional2[0][0][0] = 1;
        tridimensional2[0][0][1] = 2;
        tridimensional2[0][1][0] = 3;
        tridimensional2[0][1][1] = 3;

    }
}
