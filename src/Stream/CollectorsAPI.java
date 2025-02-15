package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorsAPI {
    public static void main(String[] args) {
        List<String> words  = Arrays.asList("hello", "world","com", "bat","hello");
        Map<String,Integer> wordlenmap = words.stream().distinct().collect(
                Collectors.toMap(word -> word, word -> word.length())
        );
        System.out.println(wordlenmap);


        //Group names by their first letter
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
        Map<Character,List<String>> groupedNames = names.stream().collect(Collectors
                .groupingBy(name -> name.charAt(0)));

        System.out.println(groupedNames);

        // Example (Group numbers as even or odd):
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
        Map<String,List<Integer>> numberlenmap = numbers.stream().collect(
                     Collectors.groupingBy(n -> (n%2 == 0) ? "Even" : "odd" ));
        System.out.println(numberlenmap);

        //partitioningBy(Predicate<T>) - Partitioning Data   - Partition students based on passing marks
        //Splitting data into two groups (true/false) instead of multiple groups like groupingBy().
        List<Integer> numbers2 = Arrays.asList(10,20,30,40,50,60,70,80,90);
        Map<Boolean,List<Integer>> passFail = numbers2.stream().collect(
                Collectors.partitioningBy(num -> num > 40)
        );
        System.out.println(passFail);

    }
}
