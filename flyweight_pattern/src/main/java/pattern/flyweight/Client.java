package pattern.flyweight;

/**
 * Created by piguanghua on 2017/2/16.
 */
public class Client {
    private static  int num = 0;
    public static void main(String args[]) {
        Thread[] threads = new Thread[1000];
        for(int i = 0; i < 1000; i++){
            Runnable runnable = () ->{
                num++;
                Singleton.getSingleton();
                System.out.println(Thread.currentThread().getName());
                /*try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }*/
                System.out.println(Thread.currentThread().getState());
            };
            threads[i] = new Thread(runnable);
        }
        threads[1].start();
        try {
            threads[1].join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(threads[1].getState());
        System.out.println(threads[1].isAlive());
        /*
        threads[1].start();
        while (Boolean.TRUE){
            threads[1].start();
        }*/


        /*for(Thread thread: threads){
            System.out.println("Thread");
            thread.start();
        }*/

    }
}
