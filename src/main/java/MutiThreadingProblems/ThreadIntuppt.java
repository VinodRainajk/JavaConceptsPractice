package MutiThreadingProblems;

public class ThreadIntuppt {

    public static void main(String[] args) {

        Thread th1 = new Thread(new Runnable() {
            @Override
            public void run() {

                for(long idx = 0; idx <10000000000l; idx++)
                {

                    if(Thread.currentThread().isInterrupted())
                    {
                        System.out.println("Thread is interupted");
                        return;
                    }
                }


            }
        });

        th1.setDaemon(true);
        th1.start();

        th1.interrupt();
    }
}
