package AdderSubstructorMutex;


import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Substructor implements Callable<Void> {
    private Value v;
    private Lock lock;

    Substructor(Value x, Lock l){
        v = x;
        lock = l;
    }
    public Void call(){
        for(int i=1;i<=500;i++){
            lock.lock();
            this.v.val -= i;
            lock.unlock();
        }
        return null;
    }
}
