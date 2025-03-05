package com.example.udemy;

import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {

        CustomThread th = new CustomThread();
        th.start();                             // nb: the run() method is called sequentially by the calling thread, i.e it will wait for it to finish
                                                // whereas start() will kick it off, and continue with executing further statements

        Runnable runnable = () -> {             // runnable lambda expression

            for(int i = 1; i <= 8; i++){
                System.out.println(" 2 ");
                try {
                    TimeUnit.MILLISECONDS.sleep(250);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        };

        Thread runnableThread = new Thread(runnable);
        runnableThread.start();


        for(int i = 1; i <=5; i++) {
            System.out.println(" 0 ");
            try{
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}