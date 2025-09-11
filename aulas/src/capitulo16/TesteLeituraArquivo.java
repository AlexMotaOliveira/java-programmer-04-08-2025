package capitulo16;

import java.io.*;

public class TesteLeituraArquivo {


    public static void main(String[] args) {

        try {

            FileInputStream inputStream = new FileInputStream("Teste.csv");
            DataInputStream stream = new DataInputStream(inputStream);
            String texto = stream.readLine();

            System.out.println(texto);
            stream.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
