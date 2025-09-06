package capitulo15.cab15lab2;

import java.util.ArrayList;
import java.util.List;

public class Cab15lab2 {


    public static void main(String[] args) {

        List<Estudante> estudanteList = new ArrayList<>();
        estudanteList.add(new Estudante("Joana", 8.5, 8.5));

        Estudante estudante = new Estudante("Antonio", 6, 9);
        estudanteList.add(estudante);

        estudanteList.add(new Estudante("Mariana", 7.5, 9));
        estudanteList.add(new Estudante("Ricardo", 7, 6));
        estudanteList.add(new Estudante("Gustavo", 9.5, 10));


        estudanteList.forEach(estudante1 -> {
//            double soma = estudante1.getNotaMatematica() + estudante1.getNotaPortugues();
//            double media = soma / 2;
//            estudante1.setMedia(media);

            estudante1.setMedia((estudante1.getNotaMatematica() +
                    estudante1.getNotaPortugues()) / 2);
        });

        estudanteList.forEach(System.out::println);

    }
}
