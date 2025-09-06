package capitulo13;

import capitulo12.Soma;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class DivisaoTeste {

    @Test
    @DisplayName("teste da divisao")
    void testeDivisaoPorDouble() {
        double resultado = Divisao.dividir(10, 10);

        Assertions.assertEquals(1, resultado);
    }
}
