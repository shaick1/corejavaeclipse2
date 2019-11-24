public class Thread2 implements Runnable{

    public void run() {
        for (int i=0;i<10;i++) {
            System.out.println("Current i is "+i);

        }
    }

    public static void main(String arg[]) {

        Thread2 t2 = new Thread2();
        Thread t = new Thread(t2);
        t.start();
    }

}
