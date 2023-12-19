package MultiThreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Sorter implements Callable<List<Integer>> {
    private List<Integer> arrayToSort;
    Sorter(List<Integer> a){
        arrayToSort = a;
    }
    public List<Integer> call() throws Exception{
        if(arrayToSort.size() <= 1){
            return arrayToSort;
        }
        int s = arrayToSort.size();
        int mid = s/2;

        List<Integer> leftArray = new ArrayList<>();
        List<Integer> rightArray = new ArrayList<>();

        for(int i=0;i<mid;i++){
            leftArray.add(arrayToSort.get(i));
        }

        for(int i=mid;i<s;i++){
            rightArray.add(arrayToSort.get(i));
        }

        ExecutorService es = Executors.newCachedThreadPool();

        Sorter leftArraySortTask = new Sorter(leftArray);
        Sorter rightArraySortTask = new Sorter(rightArray);

        Future<List<Integer>> leftArraySorted =  es.submit(leftArraySortTask);
        Future<List<Integer>> rightArraySorted =  es.submit(rightArraySortTask);

        List<Integer> sortedLeftArray = leftArraySorted.get();
        List<Integer> sortedRightArray = rightArraySorted.get();
        return null;
    }
}
