package capitulo16;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TesteEscritaArquivo {

    public static void main(String[] args) {

        try {
            String texto = "meu, primeiro, texto, no, arquivo";
            FileOutputStream outputStream = new FileOutputStream("Teste.csv");
            DataOutputStream stream = new DataOutputStream(outputStream);
            stream.writeBytes(texto);
            stream.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
