package com.example;

import java.util.concurrent.TimeUnit;

public class Main{

    public static void main(String[] args){
        System.out.println("Main thread running");
        
        try {
            System.out.println("Main thread paused for 1 second");
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Thread thread = new Thread(() -> {
            String tname = Thread.currentThread().getName();
            System.out.println(tname + " should take 10 dots to run");

            for(int i = 0; i < 10; i++){
                System.out.print(". ");
                try{
                    TimeUnit.MILLISECONDS.sleep(500);
                } catch(InterruptedException e ){
                    System.out.println("\nWhoops " + tname + " Interrupted.");
                    return;
                }
            }
            System.out.println("\n" + tname + " completed.");
        });

        System.out.println(thread.getName() + " starting");
        thread.start();

        System.out.println("Main thread running again.");

        /*
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread.interrupt(); // after 2 secs of main thread sleeping, the other thread is interrupted
        */

       
    }
}