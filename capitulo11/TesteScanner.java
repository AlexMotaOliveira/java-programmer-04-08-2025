package capitulo11;

import capitulo5.pacotes.executar.Run;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TesteScanner {

    public static void main(String[] args) {

        try {
            System.out.println("meu programa iniciou");
            Scanner scanner = new Scanner(System.in);

            System.out.println("digite um numero positivo");
            long valor1 = scanner.nextLong();
            System.out.println("digite outro numero positivo");
            long valor2 = scanner.nextLong();

            long somar = Soma.somar(valor1, valor2);

            System.out.println("o valor da soma: " + somar);

        } catch (SomarNumerosNegativosException | InputMismatchException ex) {
            ex.printStackTrace();
        } finally {
            System.out.println("fim do programa");
        }
    }
}
