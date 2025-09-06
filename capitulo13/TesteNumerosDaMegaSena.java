package capitulo13;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class TesteNumerosDaMegaSena {

    @Test
    void testeNumerosMegaSena() {
        int numero = NumerosDaMegaSena
                .sortearNumeroMegaSena();
        System.out.println(numero);
        Assertions
                .assertTrue(numero > 0 && numero <= 60);
    }

    @Test
    void validarJogoMegaSena() {
        int[] jogoMegaSena = NumerosDaMegaSena.jogoMegaSena();

        for (int numeroSorteado : jogoMegaSena) {
            System.out.println("valor do numero: " + numeroSorteado);
            Assertions.assertTrue(numeroSorteado > 0 && numeroSorteado <= 60);
        }
    }
}
