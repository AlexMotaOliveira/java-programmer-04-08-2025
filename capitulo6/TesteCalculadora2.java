package capitulo6;

public class TesteCalculadora2 {

    public static void main(String[] args) {

        Calculadora cal = new Calculadora();
        cal.somar(12,15);
        cal.somar(12L, 15L);
        cal.somar(12L, 15);
        cal.somar(15D, 20D);
        cal.somar(15, 15D);
    }
}
