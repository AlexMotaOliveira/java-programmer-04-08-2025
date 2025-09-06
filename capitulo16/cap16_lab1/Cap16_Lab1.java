package capitulo16.cap16_lab1;

import java.io.*;

public class Cap16_Lab1 {

    public static void main(String[] args) {
        escrever("Capítulo 16\\nLaboratório 1");
        ler();
    }

    static void escrever(String texto) {
        try {
            FileOutputStream outputStream = new FileOutputStream("Cap16_Lab1.txt");
            DataOutputStream dados = new DataOutputStream(outputStream);
            dados.writeChars(texto);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    static void ler() {
        try {
            FileInputStream inputStream = new FileInputStream("Cap16_Lab1.txt");
            DataInputStream dados = new DataInputStream(inputStream);

            while (dados.available() > 0) {
                char c = dados.readChar();
                System.out.print(c);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
