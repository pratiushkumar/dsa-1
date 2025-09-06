public class PrimeThread extends Thread  {
static {
    System.out.println("before");
}
    public int val;

    PrimeThread(int val) {
        this.val = val;
    }

    public void run() {System.out.println("great deed ");
    }

    public static void main(String[] args) {
        PrimeThread pro = new PrimeThread(54);
        pro.start();
        pro.run();

    }
}
