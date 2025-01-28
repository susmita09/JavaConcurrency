package ProducerConsumer;

import java.util.concurrent.Semaphore;

public class Producer implements Runnable {
    private final Store store;
    private Semaphore producerSema;
    private Semaphore consumerSema;
    public Producer(Store st, Semaphore producer, Semaphore consumer){

        this.store = st;
        this.producerSema = producer;
        this.consumerSema = consumer;
    }


    @Override
    public void run() {
        while(true){

            try{
                producerSema.acquire();

            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("Cleared production check");
            store.addItem();
            consumerSema.release();

                }
            }
        }

//        while(true){
//            synchronized (store) {
//                if (store.getItems().size() < store.getMaxsize()) {
//                    System.out.println("Cleared production check");
//                    store.addItem();
//                }
//            }
//        }


