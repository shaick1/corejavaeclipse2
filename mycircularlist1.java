
public class mycircularlist1 {

    static class Node {
        int data;
        Node next;
        public Node(int d) {
            this.data=d;
            this.next=null;
        }
    }
    Node head;
    Node tail;

    public void add(int d) {
        Node n = new Node(d);
        if (this.head == null){
            this.head=n;
            this.tail=n;
            n.next=head;
        }
        else {
            tail.next=n;
            tail=n;
            n.next=head;
        }
    }
    public void display() {
        Node n = this.head;
        System.out.println("count is " + getcount());
        for (int i=1;i<=getcount();i++) {
            System.out.println("count is " + i +" " + getcount());

            System.out.println(n.data);
            n = n.next;
        }

    }

    public int getcount() {
        int listcount=0;
        Node n = this.head;
        do {
            listcount++;
            n = n.next;
        } while (n != head);


      //  System.out.println(listcount);
        return listcount;
    }
    public static void main(String args[]) {
        mycircularlist1 linkedlist1 = new mycircularlist1();

        linkedlist1.add(1);
        linkedlist1.add(2);
        linkedlist1.add(3);
        linkedlist1.add(4);
        linkedlist1.add(5);

        linkedlist1.getcount();
        linkedlist1.display();


    }

}
