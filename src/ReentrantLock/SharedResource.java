package ReentrantLock;

import java.util.concurrent.locks.ReentrantLock;

public class SharedResource {
    boolean isAvailable = false;
    private int count = 0;

    public void increment(ReentrantLock lock){
        try{
            lock.lock();
            count++;
            System.out.println("lock acquired by "+ Thread.currentThread().getName());
            System.out.println(Thread.currentThread().getName() + " incremented counter to " + count);
            nestedIncrement(lock);
            isAvailable =true;
           Thread.sleep(5000);
        }catch(Exception e){

        }
        finally {
            lock.unlock();
            System.out.println("lock released by "+ Thread.currentThread().getName());

        }
    }
    public void  nestedIncrement(ReentrantLock lock){
        lock.lock();
        try{
            count++;
            System.out.println("lock acquired by "+ Thread.currentThread().getName());
        }
        finally {
            lock.unlock(); // Release the lock
        }
    }
    public int getCounter() {
        return count;
    }
}
