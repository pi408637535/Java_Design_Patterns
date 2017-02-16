package pattern.flyweight;

/**
 * Created by piguanghua on 2017/2/16.
 */
public class Client {
    public static void main(String args[]) {
        Thread[] threads = new Thread[1000];
        for(int i = 0; i < 1000; i++){
            Runnable runnable = () ->{
                Singleton.getSingleton();
                System.out.println(Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            };
            threads[i] = new Thread(runnable);
        }

        while (Boolean.TRUE){
            threads[1].start();
//            threads[1].start();
        }

        /*for(Thread thread: threads){
            System.out.println("Thread");
            thread.start();
        }*/

    }
}
