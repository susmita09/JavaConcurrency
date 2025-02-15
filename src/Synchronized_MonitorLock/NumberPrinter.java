package Synchronized_MonitorLock;

public class NumberPrinter
{
    private int count = 1;
    private int numOfThreads;

    public NumberPrinter(int numOfThreads) {
        this.numOfThreads = numOfThreads;
    }

    public synchronized void printNumber(int threadId) {
        while(count <= 10){
            //check if this is current thread turn
            while( count%numOfThreads != threadId){
                 try{
                     wait();
                 }
                 catch(InterruptedException e){
                     e.printStackTrace();
                 }
            }
            if(count >= 10) break;
//            count++;
            System.out.println("Thread"+ threadId + ": " + count++);
            notifyAll();
        }
    }
}
