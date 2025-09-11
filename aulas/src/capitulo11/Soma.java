package capitulo11;

public interface Soma {

    static int somar(int valor1, int valor2){
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
