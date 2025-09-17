class MyThread extends Thread {
    public void run() {
        System.out.println("Run method");
    }
}
public class My{
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.run();
        t.start();
    }
}
