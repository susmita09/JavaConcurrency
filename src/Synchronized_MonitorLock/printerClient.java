package Synchronized_MonitorLock;



public class printerClient {
    public static void main(String[] args) {
        int noOfThreads = 3;
        NumberPrinter printer = new NumberPrinter(noOfThreads);

        //we want multiple thread access the function
        //inside run method we write what we want the thread to do - work

        //create and start thread
        for(int i = 0; i < noOfThreads; i++) {
            final int id =i;
            Thread thread = new Thread(new Runnable() {
                public void run() {
                    printer.printNumber(id);
                }
            });
            thread.start();
        }

        // Or using lambda syntax
//        for (int i = 0; i < numOfThreads; i++) {
//            final int id = i;
//            new Thread(() -> printer.printNumber(id)).start();
//        }




    }
}
