package AdderSubstructorMutex;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;



public class  Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Value v = new Value();
        Lock lock = new ReentrantLock();  // there are different types of lock in java
        Adder a = new Adder(v,lock);
        Substructor s = new Substructor(v,lock);

        ExecutorService ec = Executors.newCachedThreadPool(); // we are using thread pool

        Future<Void> addFu = ec.submit(a);
        Future<Void> subFu = ec.submit(s);

        addFu.get();
        subFu.get();

        System.out.println(v.val);
    }
}
