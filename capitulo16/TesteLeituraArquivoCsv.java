package capitulo16;

import capitulo19.cap19lab1.br.com.impacta.java.model.Funcionario;
import capitulo19.cap19lab1.br.com.impacta.java.repository.FuncionarioRepository;
import capitulo19.cap19lab1.br.com.impacta.java.repository.FuncionarioRepositoryImplementacao;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class TesteLeituraArquivoCsv {


    public static void main(String[] args) {

        try {

            FileInputStream inputStream = new FileInputStream("funcionarios.csv");
            DataInputStream stream = new DataInputStream(inputStream);
            String texto = stream.readLine();
            System.out.println(texto);

            texto = stream.readLine();
            List<Funcionario> funcionarios = new ArrayList<>();
            while (texto != null) {
                System.out.println(texto);
                String [] textoSplit =  texto.split(",");

                int id = Integer.parseInt(textoSplit[0]);
                String nome = textoSplit[1];
                double salario = Double.parseDouble(textoSplit[2]);
                int cargoId = Integer.parseInt(textoSplit[3]);

                Funcionario funcionario = new Funcionario(nome, salario, cargoId);
                System.out.println(funcionario);

                FuncionarioRepository repository = new FuncionarioRepositoryImplementacao();
                repository.salvar(funcionario);

                texto = stream.readLine();
            }

            stream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
