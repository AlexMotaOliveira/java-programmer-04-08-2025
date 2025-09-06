package capitulo17;

public class TesteThreads {

    public static void main(String[] args) throws InterruptedException {
        Thread thread = Thread.currentThread();
        System.out.println(thread.getName());

//        int contador = 0;
//        do {
//            System.out.println(thread.getName());
//        } while (contador++ < 10000);


        Seguimento seguimento = new Seguimento();
        seguimento.start();

        ExemploThreads exemploThreads = new ExemploThreads();
        exemploThreads.start();

        while (true) {
//            Thread.sleep(1000);
            System.out.println(thread.getName());
        }
    }
}
