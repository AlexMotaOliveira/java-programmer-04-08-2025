package capitulo12;

import capitulo11.SomarNumerosNegativosException;

public interface Soma {

    /**
     *<h3> Este � um metodo static para soma de dois valores inteiros
     *</3>
     * @param {@code valor1} � o primeiro valor para a soma
     * @param valor2 � o segundo valor da soma
     * @return retorna a @see soma do valor1 + valor2
     *
     * @throws RuntimeException erro em tempo de execu��o
     */
    static int somar(int valor1, int valor2) throws RuntimeException{
        if(valor1 < 0 || valor2 < 0){
            throw new RuntimeException("n�o deve ser informado numeros negativos");
        }
        return valor1 + valor2;
    }

    static long somar(long valor1, long valor2){
        if(valor1 < 0 || valor2 < 0){
            throw new SomarNumerosNegativosException(
                    "n�o deve ser informado numeros negativos");
        }
        return valor1 + valor2;
    }
}
