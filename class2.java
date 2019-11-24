package A;
public class class2 extends A.class1{
    public void pubB(){
        System.out.println("my name is pub1");
    }
    protected void protB() {
        System.out.println("name name is prot");
    }
    void defaultfunB() {
        System.out.println("In default function");
    }
    private void privatefunB() {
        System.out.println("In private");
    }

    public void function_from_samefun() {
        System.out.println("In function_from_samefun");
        pubB();
        protB();
        defaultfunB();
        privatefunB();


    }

    public static void main(String arg[]) {

        A.class1 same_class1 = new A.class1();
        class2 same_class2=new class2();

        same_class2.pubA();
        same_class2.protA();
        same_class2.defaultfunA();
        //same_class2.privatefunA();
        same_class2.function_from_samefun();

        same_class2.pubB();
        same_class2.protB();
        same_class2.defaultfunB();
        same_class2.privatefunB();
        same_class2.function_from_samefun();

        System.out.println("insance of same_class1" + same_class1 instanceof Object);
        System.out.println("hashcode"+same_class1.hashCode());
    }
}
