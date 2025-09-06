package capitulo17;

public class ExemploRunnable {

    public static void main(String[] args) {

        Runnable runnable = new TesteRunnable();
        Thread thread = new Thread(runnable);
        thread.setPriority(Thread.MIN_PRIORITY);
        Thread thread1 = new Thread(runnable);
        thread1.setPriority(Thread.MIN_PRIORITY);
        Thread thread2 = new Thread(runnable);
        thread2.setPriority(Thread.MIN_PRIORITY);
        Thread thread3 = new Thread(runnable);
        thread3.setPriority(Thread.MIN_PRIORITY);


        thread.start();
        thread1.start();
        thread2.start();
        thread3.start();


        Runnable runnable1 = () -> {
            Thread thread4 = Thread.currentThread();
            System.out.println("interface Runnable, nome: " + thread4.getName());
            try {
                thread4.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Thread thread5 = new Thread(runnable1);
        thread5.setPriority(Thread.MAX_PRIORITY);
        thread5.start();
    }
}
