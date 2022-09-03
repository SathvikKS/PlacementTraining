public class DaemonThread extends Thread{
    public void run() {
        if(Thread.currentThread().isDaemon()) {
            System.out.println("Daemon thread is running");
        } else {
            System.out.println("User thread is running");
        }
    }

    public static void main(String[] args) {
        DaemonThread t1 = new DaemonThread();
        DaemonThread t2 = new DaemonThread();
        DaemonThread t3 = new DaemonThread();
        t1.setDaemon(true);
        t1.start();
        t2.start();
        t3.start();
    }
}
