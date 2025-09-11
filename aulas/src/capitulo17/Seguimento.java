package capitulo17;

import capitulo5.pacotes.executar.Run;

public class Seguimento extends Thread {

    @Override
    public void run() {
        try {
            while (true) {
                Thread thread = Thread.currentThread();
                thread.sleep(1000); // 10s
                System.out.println("minha thread de seguimento");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
