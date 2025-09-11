package capitulo15;

import capitulo5.pacotes.modelos.Marca;

import java.util.HashMap;
import java.util.Map;

public class TesteMap {

    public static void main(String[] args) {

//        Map<String, String> map = new HashMap<>();
//
//        map.put(null, null);
//        map.put("321654987-55", "Mary da Silva");
//        map.put(null, "Mary da Silva");
//        map.put("123456789-12", "Ricardao da Silva");
//
//        map.forEach((chave, valor) -> {
//            System.out.println(chave + " : " + valor);
//        });

        Map<Integer, Funcionario> funcionarioMap = new HashMap<>();
        Funcionario funcionario =
                new Funcionario(123, "Alex ", "Instrutor", 10000D);

        Funcionario funcionario2 =
                new Funcionario(125, "Roberto ", "Instrutor", 10000D);

        funcionarioMap.put(funcionario.getMatricula(), funcionario);
        funcionarioMap.put(funcionario2.getMatricula(), funcionario2);

        funcionarioMap.forEach((chave, funcionario1) ->
                System.out.println("chave: " + chave + " - " + funcionario1.getNome())
        );

        System.out.println(funcionarioMap.get(123));
        System.out.println(funcionarioMap.size());
        System.out.println(funcionarioMap.remove(123));
        funcionarioMap.clear();




    }
}
