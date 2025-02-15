package Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Intermidate {
    public static void main(String[] args) {
        //filer takes a predicate  -> filter elements based on a condition
        List<Integer> num = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> even = num.stream().
                filter(n -> n%2 == 0).collect(Collectors.toList());


        //map (function <T,R> - used to transform element in a stream
        //converting entities to DTos, parsing string
        //convert to upper case
        List<String> names = Arrays.asList("alice", "bob", "charlie");
        List<String> upname = names.stream().
                   map(n -> n.toUpperCase()).collect(Collectors.toList());
        System.out.println(upname);


        //FLARMAP
        //use to flatten nested collection into single stream
        // use case - Handling -  list of list (list of transections per usser)

        List<List<Integer>> lists = Arrays.asList(
                Arrays.asList(2,3,4,5,5),
                Arrays.asList(0,7,8,5,4,1),
                Arrays.asList(56,346,7)
        );
       List<Integer> ans = lists.stream().flatMap(
                (List<Integer> a)-> a.stream()).distinct()
                      .sorted(Comparator.reverseOrder())
                    // .limit(4)
                   //   .skip(3)  skip 1st n elements
                         .collect(Collectors.toList());

        System.out.println(ans);

    }
}
