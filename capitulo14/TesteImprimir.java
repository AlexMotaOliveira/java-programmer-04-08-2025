package capitulo14;

import java.util.function.Consumer;

public class TesteImprimir {


    public static void main(String[] args) {

        Imprimir imprimir = () -> System.out.println("imprimir sem retorno");

        imprimir.mostrarDados();

        Consumer<String> imprimirFuncao = (texto) -> System.out.println(texto);

        imprimirFuncao.accept("imprimir sem retorno funcao");
    }
}
