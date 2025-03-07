import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String... args) {

        // set the TimeUnit to seconds, meaning the count will be n*1 of unit.
        StopWatch stopWatch = new StopWatch(TimeUnit.SECONDS);
        
        // Thread using a method reference
        Thread green = new Thread(stopWatch::countDown, ThreadColor.ANSI_GREEN.name());

        // Thread using a lambda function
        Thread purple = new Thread(() -> stopWatch.countDown(7), ThreadColor.ANSI_PURPLE.name());

        Thread red = new Thread(stopWatch::countDown, ThreadColor.ANSI_RED.name());

        green.start();
        purple.start();
        red.start();
    }
}

class StopWatch {

    private TimeUnit timeUnit;


    public StopWatch(TimeUnit timeUnit){
        this.timeUnit = timeUnit;
    }

    public void countDown(){
        countDown(5);
    }

    public void countDown(int unitCount) {
        
        String threadName = Thread.currentThread().getName();

        ThreadColor threadColor = ThreadColor.ANSI_RESET;

        try {
            threadColor = ThreadColor.valueOf(threadName);
        } catch(IllegalArgumentException ignore) {
            // User may pass a bad colour name, and we'll ignore it.
        }

        String color = threadColor.color();

        for(int i = unitCount; i > 0; i--) {
            try {
                timeUnit.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.printf("%s%s Thread : i = %d%n", color, threadName, i);
        }
    }
}