public class Thread1 extends Thread {

    public void run() {
        for (int i=0;i<10;i++) {
            System.out.println("Current i is "+i);
            try{
                Thread.sleep(1000);
            } catch(Exception e) {

            }
        }
    }

    public static void main(String arg[]) {
    Thread1 t = new Thread1();
    t.start();

        Thread1 t1  = new Thread1();
        t1.start();

    }
}
