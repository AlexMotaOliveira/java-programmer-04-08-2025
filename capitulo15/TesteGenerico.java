package capitulo15;

public class TesteGenerico {

    public static void main(String[] args) {

        MinhaClasseGenerica<String> genericoString =
                new MinhaClasseGenerica<>("Meu texto generico");

        MinhaClasseGenerica<Integer> genericaInteger =
                new MinhaClasseGenerica<>(10);
    }
}
