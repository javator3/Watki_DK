package pl.sda.watki;

import java.util.Random;

public class RunnerExample extends Thread {
    private int num;
    @Override
    public void run(){
        System.out.println(" Num = " + getNum() );


        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public int getNum() {
        return 2*num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public RunnerExample(int num) {
        this.num = num;
    }
}


