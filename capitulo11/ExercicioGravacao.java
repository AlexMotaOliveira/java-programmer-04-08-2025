package capitulo11;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ExercicioGravacao {

    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Digite seu nome: ");

            String texto = scanner.nextLine();

            PrintWriter writer = new PrintWriter("C:\\doc1.txt");
            writer.println(texto);
            writer.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Falha ao gravar as informações digitadas");
            ex.printStackTrace();
        }
    }
}
