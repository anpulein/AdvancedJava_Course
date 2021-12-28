package Multithreading;

public class MultiTest {
    public static void main(String[] args) throws InterruptedException {
//        MyThread myThread = new MyThread();
//        myThread.start(); // Создает новый поток и выполняет его
//
//        MyThread myThread2 = new MyThread();
//        myThread2.start();
//
//        System.out.println("Hello from main thread");
//        System.out.println("I am going to sleep");
//        Thread.sleep(3000); // Поток уходит в сон
//        System.out.println("I am awake!");

        Thread myThread3 = new Thread(new Runner());
        myThread3.start();

    }
}

/*
 * Создаем новый поток
 * Thread - поток
 * более чистый метод
 */
class Runner implements Runnable {
    @Override
    public void run() {
        for(int i = 0; i < 1000; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Hello from MyThread: " + i);
        }
    }
}



/*
    * Создаем новый поток
    * Thread - поток
 */
class MyThread extends Thread {

    @Override
    public void run() {
        for(int i = 0; i < 1000; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Hello from MyThread: " + i);
        }
    }
}

