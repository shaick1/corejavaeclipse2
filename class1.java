package A;
public class class1 {

    public void pubA(){
        System.out.println("my name is pub1");
    }
    protected void protA() {
        System.out.println("name name is prot");
    }
    void defaultfunA() {
        System.out.println("In default function");
    }
    private void privatefunA() {
        System.out.println("In private");
    }

    public void function_from_samefun() {
        System.out.println("In function_from_samefun");
        pubA();
        protA();
        defaultfunA();
        privatefunA();


    }

    public static void main(String arg[]) {
        class1 same_class=new class1();
        same_class.pubA();
        same_class.protA();
        same_class.defaultfunA();
        same_class.privatefunA();
        same_class.function_from_samefun();
    }
}
