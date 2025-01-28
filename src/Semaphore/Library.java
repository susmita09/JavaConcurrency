package Semaphore;

import java.util.concurrent.Semaphore;

public class Library {

//    creating a semaphore object with 2 permits mean at most 2 threads can access the cs at a time
    private final Semaphore sp = new Semaphore(2);

    public void useComputer(String student){
        try{
            System.out.println(student + " is waiting to use a computer...");
            sp.acquire();
            System.out.println(student + " is using a computer...");
            Thread.sleep(2000);  // Simulate the student using the computer
            System.out.println(student + " is done using the computer.");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        finally {
            sp.release();
        }
    }
}
