public class mysinglelinkedlist2 {

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

    public void addNode(int d) {
        Node n = new Node(d);
        if (this.head == null){
            this.head=n;
            this.tail=n;
        }
        else {
            tail.next=n;
            tail=n;
        }
    }
    public void display() {
        Node n = this.head;
        //System.out.println(n.data);

        while (n != null) {
            System.out.println(n.data);
            n = n.next;
        }
    }

    public int getcount() {
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
        mysinglelinkedlist2 linkedlist1 = new mysinglelinkedlist2();

        linkedlist1.addNode(1);
        linkedlist1.addNode(2);
        linkedlist1.addNode(3);
        linkedlist1.addNode(4);
        linkedlist1.addNode(5);
        linkedlist1.addNode(6);
        linkedlist1.addNode(7);
        linkedlist1.addNode(8);

        linkedlist1.getcount();
        linkedlist1.display();


    }

}
