package ProducerConsumerProblem;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private int maxSize;
    private List<Object> items;

    Store(int maxSize){
        this.maxSize = maxSize;
        this.items = new ArrayList<>();
    }

    //getter setter
    public int getMaxSize(){
        return maxSize;
    }
    public List<Object> getItems(){
        return items;
    }

    // add and remove item synchronized

    public void addItem(){
        this.items.add(new Object());
        System.out.println("producer produced curr size - " + this.items.size());
    }

    public void removeItem(){
        this.items.remove(this.items.size() - 1);
        System.out.println("consumer consuming curr size - " + this.items.size());
    }

}
