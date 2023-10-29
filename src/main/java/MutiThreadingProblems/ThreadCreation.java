package MutiThreadingProblems;

import java.sql.SQLOutput;

public class ThreadCreation {

    static class threadsecond extends Thread{
        @Override
        public void run() {
            System.out.println("This is the threadsecond");
        }

    }

    public static void main(String[] args) {

        Thread thread1 = new Thread (new Runnable(){
            @Override
            public void run() {
                System.out.println("This is the threadfirst");
                System.out.println("Check The Priority "+Thread.currentThread().getPriority());
                throw new RuntimeException("Internal exeption");
            }
        });

        thread1.start();

        threadsecond threadsecond = new threadsecond();
        threadsecond.start();

        threadsecond.setName("VinodRainaThread");
        thread1.setPriority(Thread.MAX_PRIORITY); // Setting priority

        thread1.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                System.out.println(" The exception is "+ e.getMessage());
            }
        });
    }

}
