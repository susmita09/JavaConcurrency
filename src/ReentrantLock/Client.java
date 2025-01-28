package ReentrantLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Client {
    public static void main(String[] args){
        ReentrantLock lock = new ReentrantLock();

        SharedResource s1 = new SharedResource();
        Thread t1 = new Thread(()-> {
            for(int i=0; i<3; i++){
                s1.increment(lock);
            }

        });

//       lock SharedResource s2 = new SharedResource();
        Thread t2 = new Thread(()-> {
            for(int i=0; i<3; i++){
                s1.increment(lock);
            }

        });

        t1.start();
        t2.start();

        System.out.println("Final counter value: " + s1.getCounter());

        //create thread using annonomus inner class
        Thread t3 = new Thread(){
            @Override
            public void run() {
                for(int i=0; i<3; i++){
                    s1.increment(lock);
                }
            }
        };

        //extending thread class
        CounterThread t4 = new CounterThread();
        t4.start();

        //implementing runnable interface
        CounterThreadInterface ti = new CounterThreadInterface();
        Thread t5 = new Thread(ti);
        t5.start();


    }
}
