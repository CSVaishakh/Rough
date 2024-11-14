package JAVA;

import java.util.Random;

class Even extends Thread {
    private int num;

    Even(int num) {
        this.num = num;
    }


    public void run() {
        System.out.println("The generated number, " + num + " is even");
        System.out.println("The square of the number is " + num * num);
    }
}

class Odd extends Thread {
    private int num;

    Odd(int num) {
        this.num = num;
    }


    public void run() {
        System.out.println("The generated number " + num + " is odd");
        System.out.println("The cube of the number is " + num * num * num);
    }
}

class RandomThread extends Thread {
    RandomThread() {
        start();
    }


    public void run() {
        Random r = new Random();
        try {
            for (int i = 0; i < 10; i++) {
                int n = r.nextInt(10);
                Thread.sleep(1000);
                if ((n % 2) == 0) {
                    Even evenThread = new Even(n);
                    evenThread.start(); // Start the Even thread here
                } else {
                    Odd oddThread = new Odd(n);
                    oddThread.start(); // Start the Odd thread here
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Multi2 {
    public static void main(String[] args) {
        new RandomThread();
    }
}
