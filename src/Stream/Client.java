package Stream;

import java.util.function.Consumer;
import java.util.function.Function;

public class Client {
    public static void main(String[] args) {
        Function<Integer,String> marksToGrade = (mars) ->{
            if(mars < 10){
                return "A";
            }
            else if(mars < 20){
                return "B";
            }
            else{
                return "C";
            }
        };
        System.out.println(marksToGrade.apply(10));


        Consumer<String> consumer = email -> {
            System.out.println(email);
        };
        consumer.accept("a@b.com");
    }
}
