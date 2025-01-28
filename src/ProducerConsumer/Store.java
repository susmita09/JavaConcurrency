package ProducerConsumer;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Store {
    private int maxsize;
    private ConcurrentLinkedQueue<Object> items;

    public Store(int maxsize){
        this.maxsize = maxsize;
        this.items = new ConcurrentLinkedQueue<>();
    }

    public int getMaxsize() {
        return maxsize;
    }


    public ConcurrentLinkedQueue<Object> getItems() {
        return items;
    }

    public void addItem(){
        System.out.println("Producer production time, current size " + this.items.size());
        this.items.add(new Object());
    }
    public void removeItem(){
        System.out.println("Consumer consuming time, current size " + this.items.size());
        this.items.remove();
    }
}
