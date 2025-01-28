package ProducerConsumer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class Client {
    public static void main(String[] args){
        Semaphore producer = new Semaphore(5);
        Semaphore consumer = new Semaphore(0);
        ExecutorService executorService = Executors.newCachedThreadPool();
        Store store = new Store(5);


//        here we are creating 8 producer and 20 consumer
        for(int i=1;i<=8;i++){
            executorService.execute(new Producer(store,producer,consumer));
        }
        for(int i=1;i<=20;i++){
            executorService.execute(new Consumer(store,producer,consumer));
        }
    }
}
