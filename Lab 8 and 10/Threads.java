class DisplayThread extends Thread {
    private String message;
    private int interval;
    private volatile boolean running = true;

    public DisplayThread(String message, int interval) {
        this.message = message;
        this.interval = interval;
    }

    public void stopThread() {
        running = false;
    }

    public void run() {
        while (running) {
            System.out.println(message);
            try {
                Thread.sleep(interval * 1000);  // Convert seconds to milliseconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Threads {
    public static void main(String[] args) {
        // Create threads
        DisplayThread thread1 = new DisplayThread("BMS College of Engineering", 10);
        DisplayThread thread2 = new DisplayThread("CSE", 2);

        // Start threads
        thread1.start();
        thread2.start();

        // Sleep for some time (e.g., 30 seconds) to let the threads run
        try {
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Stop the threads
        thread1.stopThread();
        thread2.stopThread();
    }
}
