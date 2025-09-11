package capitulo19.cap19lab1.br.com.impacta.java;

import capitulo19.cap19lab1.br.com.impacta.java.dao.DAOException;
import capitulo19.cap19lab1.br.com.impacta.java.dao.FuncionarioDAO;
import capitulo19.cap19lab1.br.com.impacta.java.model.Funcionario;
import capitulo19.cap19lab1.br.com.impacta.java.repository.FuncionarioRepository;
import capitulo19.cap19lab1.br.com.impacta.java.repository.FuncionarioRepositoryImplementacao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExecutarCadastro2 {

    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(System.in);

            System.out.println("cadastro de funcionario");
            System.out.println("Digite o nome: ");
            String nome = scanner.nextLine();

            System.out.println("Digite o salario: ");
            double salario = scanner.nextDouble();

            System.out.println("digite o id do cargo do funcionario");
            int cargoId = scanner.nextInt();

            Funcionario funcionario = new Funcionario(nome, salario, cargoId);

            System.out.println(funcionario);

            FuncionarioRepository repository = new FuncionarioRepositoryImplementacao();
            repository.salvar(funcionario);

            repository.buscarPorNome(nome)
                    .forEach(System.out::println);

        } catch (InputMismatchException e) {
            System.out.println("digite um valor valido para criar um funcionario");
            e.printStackTrace();

        }
    }
}
