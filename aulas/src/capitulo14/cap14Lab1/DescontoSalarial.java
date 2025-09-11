package capitulo14.cap14Lab1;

import java.util.function.DoubleUnaryOperator;

public class DescontoSalarial {

    public static void main(String[] args) {

        double[] salariosBrutos = {1_350.00, 4_320.15, 8_235.25, 2_500.55, 1_830.00, 850.26, 3_614.29, 12_500.00};

        DoubleUnaryOperator descontaSalario = salario -> salario * 0.9;

        double[] salariosLiquidos =
                DoubleArrayUtils.transformaValores(salariosBrutos, descontaSalario);

        for (double salario : salariosLiquidos) {
            System.out.printf("Salario com desconto: R$%5.2f \n", salario);
        }
    }
}
