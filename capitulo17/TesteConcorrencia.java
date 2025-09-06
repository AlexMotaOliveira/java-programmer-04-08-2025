package capitulo17;

public class TesteConcorrencia {

    public static void main(String[] args) {
        ExemploConcorrencia concorrencia =
                new ExemploConcorrencia("teste concorrencia 1");

        ExemploConcorrencia concorrencia2 =
                new ExemploConcorrencia("teste concorrencia 2");

        concorrencia.start();
        concorrencia2.start();
    }
}
