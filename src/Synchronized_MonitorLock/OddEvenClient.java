package Synchronized_MonitorLock;

public class OddEvenClient {
    public static void main(String[] args) {
        OddEvenPrinter oddEvenPrinter = new OddEvenPrinter(10);
        Thread odd = new Thread(() -> oddEvenPrinter.printOdd());
        Thread even = new Thread(() -> oddEvenPrinter.printEven());

        odd.start();
        even.start();
    }
}
