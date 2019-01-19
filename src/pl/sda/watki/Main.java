package pl.sda.watki;

import java.util.Random;

class Runner implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 500; i++) {
            System.out.println("Hello : " + i+ "thread: " +Thread.currentThread().getName());
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class Main {

    public static void main(String[] args) {
       // Thread thread = new Thread(new Runner());
       // Thread thread2 = new Thread(new Runner());
      //  thread.start();
      //  thread2.start();

        for (int i = 0; i < 5000; i++) {
            new RunnerExample(i).start();
        }
       // RunnerExample runnerExample = new RunnerExample();
       // RunnerExample runnerExample2 = new RunnerExample();
       // runnerExample.start();
       // runnerExample2.start();



        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 500; i++) {
                    System.out.println("Hello : " + i + "thread: " + Thread.currentThread().getName());
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        //thread.start();
	// write your code here
    }
}
