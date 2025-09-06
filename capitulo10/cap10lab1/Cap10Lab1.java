package capitulo10.cap10lab1;

public class Cap10Lab1 {

    public static void main(String[] args) {

        Imprimivel relatorio = new Relatorio();
        Imprimivel grafico = new Grafico();

        grafico.imprimir();
        relatorio.imprimir();
    }
}
