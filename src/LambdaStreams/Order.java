package LambdaStreams;

import java.util.List;

public class Order {
    List<String> products;

    Order(List<String> products){
        this.products = products;
    }

    public List<String> getProducts() {
        return products;
    }
}
