package AdderSubstructor;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Value v = new Value();
        Adder a = new Adder(v);
        Substructor s = new Substructor(v);

        ExecutorService ec = Executors.newCachedThreadPool();

        Future<Void> addFu = ec.submit(a);
        Future<Void> subFu = ec.submit(s);

        addFu.get();
        subFu.get();

        System.out.println(v.value);
    }
}
