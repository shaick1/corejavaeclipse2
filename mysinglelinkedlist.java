public class mysinglelinkedlist {

    static class Node {
        int data;
        Node next;
        public Node(int d) {
            this.data=d;
            this.next=null;
        }
    }
    Node head;

    public void display() {
        Node n = this.head;
        //System.out.println(n.data);

        while (n.next != null) {
            System.out.println(n.data);
            n = n.next;
        }
    }

    public int listcount() {
        int listcount=0;
        Node n = this.head;
        while (n.next != null) {
            listcount++;
            n = n.next;
        }
        System.out.println(listcount);
        return listcount;
    }
    public static void main(String args[]) {
        mysinglelinkedlist linkedlist1 = new mysinglelinkedlist();

      linkedlist1.head=new Node(1);


      Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);

        linkedlist1.head.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n5.next=n6;

      //linkedlist1.display();
      linkedlist1.listcount();


    }

}
