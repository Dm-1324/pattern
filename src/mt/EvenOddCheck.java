package mt;

public class EvenOddCheck {
    private final Integer[] arr = {3, 10, 4, 2, 7, 5, 8, 6, 1023};
    private int index = 0;
    private Boolean isOdd = true;

    public static void main(String[] args) {

        EvenOddCheck evenOddCheck = new EvenOddCheck();

        Thread oddThread = new Thread(evenOddCheck::printOdd);
        Thread evenThread = new Thread(evenOddCheck::printEven);

        oddThread.start();
        evenThread.start();

        
    }

    public synchronized void printOdd() {
        while (index < arr.length) {
            while (!isOdd) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            if (index >= arr.length) break;
            if (arr[index] % 2 != 0) {
                System.out.println("Odd ->" + arr[index]);
                index++;
            }
            isOdd = false;
            notify();
        }
    }

    public synchronized void printEven() {
        while (index < arr.length) {
            while (isOdd) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            if (index >= arr.length) break;
            if (arr[index] % 2 == 0) {
                System.out.println("Even ->" + arr[index]);
                index++;
            }
            isOdd = true;
            notify();
        }
    }
}