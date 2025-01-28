package ProducerConsumer;

import java.util.concurrent.Semaphore;

public class Consumer implements Runnable{
    private final Store store;
    private Semaphore producerSema;
    private Semaphore consumerSema;
    public Consumer(Store st,Semaphore producer, Semaphore consumer){


        this.store = st;
        this.producerSema = producer;
        this.consumerSema = consumer;
    }


    @Override
    public void run() {
        try{
            consumerSema.acquire();

        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Cleared production check");
        store.removeItem();
         producerSema.release();



    }
}
