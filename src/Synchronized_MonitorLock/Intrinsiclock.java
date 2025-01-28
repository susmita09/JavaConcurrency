package Synchronized_MonitorLock;

public class Intrinsiclock {
    public static void main(String[] args) throws InterruptedException{
        Counter counter = new Counter();
//      both the thread below is trying to increment the count variable in counter class
//        ideally the result should be 2000 after both the thread complete execution
        Thread t1 = new Thread(() ->{
            for(int i=0;i<1000;i++){
                counter.increment();

            }
        });

        Thread t2 = new Thread(()->{
            for(int i=0;i<1000;i++){
                counter.increment();
            }
        });

//        now here we are starting the both thread
        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println(counter.getCount());
    }
}
