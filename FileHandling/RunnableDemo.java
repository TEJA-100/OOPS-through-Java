class MyRunnable implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Child Thread " + i);
        }
    }
}

public class RunnableDemo {
    public static void main(String[] args) {
        MyRunnable obj = new MyRunnable();

        java.lang.Thread t = new java.lang.Thread(obj);
        t.start();

        for (int i = 1; i <= 5; i++) {
            System.out.println("Main Thread " + i);
        }
    }
}