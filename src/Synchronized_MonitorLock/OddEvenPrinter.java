package Synchronized_MonitorLock;

public class OddEvenPrinter {
    private int number =1;
    private int limit;

    public OddEvenPrinter(int limit) {
        this.limit = limit;
    }

    public synchronized void printOdd(){
        while(number<=limit){
            while(number%2==0){     //if even number wait
                try{
                    wait();
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
            System.out.println("Odd number:" + number++);
            notifyAll();
        }
    }

    public synchronized void printEven(){
        while(number<=limit){
            while(number%2!=0){
                try {
                    wait();
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
            System.out.println("Even number:" + number++);
            notifyAll();
        }
    }
}
