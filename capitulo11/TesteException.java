package capitulo11;

import java.io.IOException;

public class TesteException {


    public static void main(String[] args) throws IOException {


        try {

            for (int contador = 0; contador < args.length; contador++) {
                int valor1 = Integer.parseInt(args[contador]);

                int proximaPosicao = contador + 1;
                int valor2 = Integer.parseInt(args[proximaPosicao]);

                long valor3 = valor1;
                long valor4 = valor2;
                long resultado = Soma.somar(valor3, valor4);

                System.out.println("soma: " + Soma.somar(valor1, valor2));
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("vc tentou acessar uma posição que não existe");
        } catch (SomarNumerosNegativosException ex) {
            System.out.print("meu erro que eu criei: ");
            ex.printStackTrace();
        } catch (RuntimeException ex) {
            System.out.print("error: ");
            ex.printStackTrace();
        }
    }
}
