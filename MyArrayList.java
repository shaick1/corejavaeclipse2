public class MyArrayList {

    private Object[] myitems;
    private int itemsize=0;

    public MyArrayList() {
        myitems = new Object[5];
    }

    //add , needs to take care of increasing size dynamically
    public void add(Object o) {
        if (myitems.length - itemsize <= 2 ) {
            int newsize =  myitems.length + 10;
            Object[] newmyitems = new Object[newsize];
            for (int i=0;i<=itemsize;i++) {
                newmyitems[i]=myitems[i];
            }
            myitems=newmyitems;
            myitems[itemsize++] = o;
        }
        else {
            myitems[itemsize++] = o;
        }
    }
    //remove, needs to take care of shifting items
    public void remove(int i) {
        for (int j=i;j<=itemsize;j++) {
            System.out.println( "Current value is " + i + j + myitems[j] + myitems[j+1]);
            myitems[j]=myitems[j+1];
            System.out.println( "Current value is " + myitems[j] + myitems[j+1]);

        }
        itemsize--;
    }

    //get
    public Object get(int i) {
        return myitems[i];
    }

    //size to get item size
    public int size(){
        return itemsize;
    }

    public static void main(String args[]) {

        MyArrayList al = new MyArrayList();

        al.add("1");
        al.add("2");
        al.add("3");
        al.add("4");
        al.add("5");
        al.add("6");
        al.add("7");

       // al.get(2);
      //  al.size();
        for (int i=0;i<=al.size()-1;i++) {
            System.out.println(al.get(i));

        }

        al.remove(1);

        for (int i=0;i<=al.size()-1;i++) {
            System.out.println(al.get(i));

        }

    }

}
