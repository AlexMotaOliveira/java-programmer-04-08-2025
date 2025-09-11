package capitulo14.cap14Lab1;

import java.util.function.DoubleConsumer;
import java.util.function.DoublePredicate;

public class MaioresSalarios {

    public static void main(String[] args) {

        double[] salariosBrutos = {1_350.00, 4_320.15, 8_235.25, 2_500.55, 1_830.00, 850.26, 3_614.29, 12_500.00};

        DoublePredicate doublePredicate = salario -> salario >= 3000;


        double[] salarioTop = DoubleArrayUtils.filtraValores(salariosBrutos, doublePredicate);

//        for (double salario : salarioTop) {
//            System.out.println(salario);
//        }


        DoubleConsumer doubleConsumer = salario -> System.out.println(salario);

        DoubleArrayUtils.processaValores(salariosBrutos, doubleConsumer);


    }

}
