package capitulo11;

import java.util.Scanner;

public class ExercicioIdade {

    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Digite seu ano de nascimento: ");

            String texto = scanner.nextLine();
            int ano = Integer.parseInt(texto);

            System.out.println("sua idade é: " + (2025 - ano));
        }catch (NumberFormatException ex){
            System.out.println("Valor digitado invalido");
        }

    }
}
