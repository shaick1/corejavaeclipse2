import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.Console;
import java.io.InputStreamReader;

public class innerclass1 {
    //static int i=81;
    int i=86;
//    public static class inner {
    public class inner {

        public void geti() {
            System.out.println(i);

        }
    }
    public static void main (String args[]) throws Exception{
        innerclass1 in1 = new innerclass1();
        innerclass1.inner in = in1.new inner();
      //  innerclass1.inner in = new innerclass1.inner();
        in.geti();
        //Console c = System.console();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        System.out.println("Give string " + a);
    }
}
