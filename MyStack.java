public class MyStack {

    private Object myitem[];
    private int capacity;
    private int top;

    public  MyStack(int size) {
        myitem = new Object[size];
        capacity=size;
        top=-1;
    }

    public void push(Object o) {
        if (top == capacity - 1) {
            System.out.println("Capacity is full");
            System.exit(1);
        }
        System.out.println(o +" " + top);
        myitem[++top]=o;
    }

    public Object pop() {
        if ( top == -1 ) {
            System.out.println("Capacity is empty");
            System.exit(1);
        }

        return myitem[top--];


    }

    public Object peek() {
        if ( top == -1 ) {
            System.out.println("Capacity is empty");
            System.exit(1);
        }
        return myitem[top];

    }


    public  static void main (String arg[]) {
        MyStack mys = new MyStack(10);

        mys.push("mytestitem1");
        mys.push("mytestitem2");
        mys.push("mytestitem3");

        System.out.println(mys.peek());

        System.out.println(mys.pop());
        System.out.println(mys.peek());


    }
}
