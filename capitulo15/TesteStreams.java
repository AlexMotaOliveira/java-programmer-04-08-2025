package capitulo15;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TesteStreams {

    public static void main(String[] args) {

        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(new Funcionario(1235, "Alex Mota", "Instrutor", 10_000d));
        funcionarios.add(new Funcionario(300, "Maria Silva", "Programador", 10_325d));
        funcionarios.add(new Funcionario(1258, "Maria Aparecida", "Professor", 9_000d));
        funcionarios.add(new Funcionario(6589, "Jose Silva", "Professor", 9_000d));
        funcionarios.add(new Funcionario(12547, "Vitor Roque", "Instrutor", 10_000d));
        funcionarios.add(new Funcionario(1293, "Vampeta Junior", "Recepcao", 1_000.10d));
        funcionarios.add(new Funcionario(1258, "Ronaldo Fenomeno", "Jogador", 50_000d));
        funcionarios.add(new Funcionario(325, "Ronaldinho Gaucho", "Jogador", 30_000d));
        funcionarios.add(new Funcionario(5689, "Marcelinho Carioca", "Jogador", 1_000d));
        funcionarios.add(new Funcionario(1257, "Rivaldo Junior", "Jogador", 10_000.10d));
        funcionarios.add(new Funcionario(1257, "Rivaldo Junior", "Jogador", 10_000.10d));
        funcionarios.add(new Funcionario(1257, "Zinedine Zidane", "Jogador", 10_0000.10d));

//        List<Funcionario> salariosMaiores = new ArrayList<>();
//
//        for (Funcionario funcionario : funcionarios) {
//            if (funcionario.getSalario() > 10_000) {
//                salariosMaiores.add(funcionario);
//            }
//        }
//
//        funcionarios.forEach(funcionario -> {
//            if (funcionario.getSalario() > 10_000) {
//                salariosMaiores.add(funcionario);
//            }
//        });
//
//        salariosMaiores.forEach(System.out::println);
//
//        List<Funcionario> salariofuncionarios = funcionarios
//                .stream()
//                .filter(item -> item.getSalario() > 10_000)
//                .filter(item -> item.getSalario() < 20_000)
//                .sorted((o1, o2) -> o1.getSalario().compareTo(o2.getSalario()))
//                .sorted(Comparator.comparing(Funcionario::getSalario).reversed())
//                .limit(1)
//                .collect(Collectors.toList());
//
//        salariofuncionarios.forEach(System.out::println);

//        Funcionario funcionarioMaiorSalario = funcionarios
//                .stream()
//                .max((o1, o2) -> o1.getSalario().compareTo(o2.getSalario()))
//                .get();
//        System.out.println(funcionarioMaiorSalario);
//
//        Funcionario funcionarioMenorSalario = funcionarios
//                .stream()
//                .min((o1, o2) -> o1.getSalario().compareTo(o2.getSalario()))
//                .get();
//
//        System.out.println(funcionarioMenorSalario);

//        funcionarios
//                .stream()
//                .sorted((o1, o2) -> o1.getSalario().compareTo(o2.getSalario()))
//                .skip(3)
//                .forEach(System.out::println);


        funcionarios
                .stream()
                .sorted((o1, o2) -> o1.compareTo(o2))
                .distinct()
                .forEach(System.out::println);

        long quantidadeitens = funcionarios
                .stream()
                .count();

        System.out.println(quantidadeitens);

//        funcionarios.forEach(item -> System.out.println(item.getCargo()));

        funcionarios
                .stream()
//                .map(item -> item.getCargo())
                .map(Funcionario::getCargo)
                .distinct()
                .forEach(System.out::println);

        funcionarios
                .stream()
                .map(item -> {
                   return  "Cargo: " + item.getCargo() + ", Salario: " + item.getSalario();
                })
                .forEach(System.out::println);










    }
}
