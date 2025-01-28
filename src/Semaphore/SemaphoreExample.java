package Semaphore;

public class SemaphoreExample {
    public static void main(String[] args){
        Library library = new Library();

        Thread t1 = new Thread(() -> library.useComputer("Alice"));
        Thread t2 = new Thread(() -> library.useComputer("Bob"));
        Thread t3 = new Thread(() -> library.useComputer("Charlie"));
        Thread t4 = new Thread(() -> library.useComputer("David"));

        // Start all the threads
        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }
}
