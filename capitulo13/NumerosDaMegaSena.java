package capitulo13;

import java.util.Random;

public interface NumerosDaMegaSena {

    static int sortearNumeroMegaSena() {
        Random random = new Random();
        int numero;

        do {
            numero = random.nextInt(60) + 1;
        } while (numero <= 0 || numero > 60);

        return numero;
    }

    static int[] jogoMegaSena() {
        int[] arrayJogo = new int[6];

        for (int itens = 0; itens < arrayJogo.length;
             itens++) {
            arrayJogo[itens] = sortearNumeroMegaSena();
        }
        return arrayJogo;
    }
}
