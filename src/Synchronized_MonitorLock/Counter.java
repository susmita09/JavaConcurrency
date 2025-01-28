package Synchronized_MonitorLock;

public class Counter {
    private int count =0;
    public synchronized  void increment(){

        count++;
        try{
            Thread.sleep(2);
        }catch (InterruptedException e){

        }

    }
    public  int getCount(){
        return count;
    }
}
