package LambdaStreams;

import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class client {
    public static void main(String[] args){
        System.out.println(Thread.currentThread().getName());

        //anonymous class
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello");
            }
        };
        Thread t = new Thread(r);


        Comparator<Integer> com = new Comparator<Integer>() {
            @Override
            public int compare(Integer integer, Integer t1) {
                return 0;
            }
        };

        //lambda expression is valid only for functional interface
        //we only need to pass function parameters and body of the function

        Runnable r1 = () ->{
            System.out.println("hello from lambda");

        };

        //comparator lambda
        Comparator<Integer> c1 = (o1,o2) ->{
            return o1 - o2;
        };

        Thread t2 = new Thread(()->{
            System.out.println("Hello from thread 2");
        });

        //another way
//        Collections.sort(l1,(o1,o2) -> {
//            return (int) o1 - o2;
//        });

        Runnable t1 = () ->{
            System.out.println("hello");
        };

        ExecutorService ex = Executors.newCachedThreadPool();
        ex.execute(t1);

        int x = Math.max(3,5);


//        java streams

        List<List<Integer>> arr1 = Arrays.asList(
                Arrays.asList(1,2,3),
                Arrays.asList(4,5),
                Arrays.asList(7,8,9)
        );
        System.out.println(arr1);
        //we want the above list of list as a single list

        List<Integer> arr = arr1.stream().flatMap( List :: stream
        ).collect(Collectors.toList());

        List<Order> orders = List.of(
                new Order(List.of("Apple", "Banana")),
                new Order(List.of("Orange", "Mango"))
        );

        List<String> allProducts = orders.stream()
                .flatMap(order -> order.getProducts().stream()) // Flatten the product lists
                .collect(Collectors.toList());


        //intermidate operations
//        filter - use when you only need to keep spacific element based on some condition
        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,8,9,10,10,9);

        Stream<Integer> st1 = numbers.stream().filter(num -> num%2 == 0); //keep only even numbers

//        distinct remove dublicate elemnt from the string
        Stream<Integer> st2 = numbers.stream().distinct();


        String s = "This is is name name";
        Map<String,Long> wordFreq = Arrays.stream(s.toLowerCase().split("\\s")).
                                 collect(Collectors.groupingBy(word -> word, Collectors.counting()));
    }
}
