package Multithreading;

import java.util.Scanner;

public class MultiTest2 {

    private int counter;

    public static void main(String[] args) throws InterruptedException {
        MultiTest2 multiTest2 = new MultiTest2();
        multiTest2.dowork();
    }

    public void dowork() throws InterruptedException {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    increment();
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    increment();
                }
            }
        });

        thread1.start();
        thread2.start();

        thread1.join(); // Ждет пока поток завершит свою работу
        thread2.join();

        System.out.println(counter);
    }

    private synchronized void increment() {
        counter++;
    }
}



