package capitulo15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MeuArray {


    public static void main(String[] args) {

        List<String> minhaLista = new ArrayList<String>();
        minhaLista.add("meu primeiro item");
        minhaLista.add("meu segundo item");

        minhaLista.forEach(item -> {
            System.out.println(item.toUpperCase());
        });


        minhaLista.addAll(Arrays.asList("-", "y", "i"));

        minhaLista.forEach(item -> {
            if (item.equals("i")) {
                System.out.println(item);
            }
        });


        minhaLista.forEach(item -> {
            System.out.println(item);
        });


        minhaLista.forEach(System.out::println);
        minhaLista.forEach(MeuArray::imprimir);

        if (minhaLista.contains("meu primeiro item")) {
            System.out.println("sim, o item existe na lista");
        }

        System.out.println(minhaLista.size());
        String itemQualquer = minhaLista.get(2);
        System.out.println(itemQualquer);
        minhaLista.remove("meu primeiro item");
        minhaLista.remove(0);

        minhaLista.forEach(System.out::println);

        minhaLista.add(1, "novo item");

        minhaLista.forEach(System.out::println);

        int index = minhaLista.indexOf("novo item");
        System.out.println(minhaLista.get(index));

        Cliente cliente1 = new Cliente("Jose", "12345678912", "123123");
        Cliente cliente2 = new Cliente("Maria", "22345678912", "123124");
        Cliente cliente3 = new Cliente("Vitor", "32345678912", "123125");
        Cliente cliente4 = new Cliente("Alexandre", "42345678912", "123126");
        Cliente cliente5 = new Cliente("Alexandre", "52345678912", "123127");

        List<Cliente> clienteList = new ArrayList<>();
        clienteList.addAll(Arrays.asList(cliente1, cliente2, cliente3, cliente4, cliente5));

        clienteList.forEach(System.out::println);

        clienteList.sort((item, item2) -> item.getNome().compareTo(item2.getNome()));
        clienteList.sort(Comparator.comparing(Cliente::getNome));

        System.out.println("--------------------");
        clienteList.forEach(System.out::println);




//        List<Integer> integerList = new ArrayList<>();
//        integerList.remove(Integer.valueOf(5));

    }

    static void imprimir(String s) {
        System.out.println(s);
    }


}
