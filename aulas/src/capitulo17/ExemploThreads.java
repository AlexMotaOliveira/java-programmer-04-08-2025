package capitulo17;

public class ExemploThreads extends Thread {

    @Override
    public void run() {
        try {
            while (true) {
                Thread thread = Thread.currentThread();
                thread.sleep(1000); // 10s
                System.out.println("minha thread de exemplo ExemploThreads");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public void run(String message) {
        System.out.println("A mensagem de execução é: " + message);
    }

}
