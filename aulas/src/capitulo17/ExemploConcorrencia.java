package capitulo17;

public class ExemploConcorrencia extends Thread {

    public static String block = "";

    public ExemploConcorrencia(String nome) {
        super(nome);
    }

    @Override
    public void run() {
        imprimir();
        synchronized (block) {
            for (int contador = 0; contador < 10; contador++) {
                try {
                    System.out.println(super.getName());
                    super.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static synchronized void imprimir() {
        Thread thread = Thread.currentThread();
        for (int contador = 0; contador < 10; contador++) {
            try {
                System.out.println(thread.getName());
                thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
