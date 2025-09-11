package capitulo15;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Cap15Lab1 {

    public static void main(String[] args) {

        Map<String, Integer> pessoaMap = new TreeMap<>();
        pessoaMap.put("Roberto", 35);
        pessoaMap.put("Carla", 26);
        pessoaMap.put("Gabriel", 18);
        pessoaMap.put("Bruna", 17);

        System.out.println(" ----- Pessoas -----");
        System.out.println("Roberto: " + pessoaMap.get("Roberto"));
        System.out.println("Carla: " + pessoaMap.get("Carla"));
        System.out.println("Gabriel: " + pessoaMap.get("Gabriel"));
        System.out.println("Bruna: " + pessoaMap.get("Bruna"));

        System.out.println(" ----- Pessoas(foreach) -----");

        pessoaMap.forEach((chave, valor) -> System.out.println(chave + ": " + valor));


    }
}
