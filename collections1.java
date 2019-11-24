import java.util.*;

public class collections1 {

    public static void main (String arg[]) {

        //ArrayList
        System.out.println("\nArrayList\n");

        ArrayList<String> al1 = new ArrayList<String>();
        al1.add("test1");
        al1.add("test2");
        al1.add("test3");

        Iterator itr = al1.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        //LinkedList
        System.out.println("\nLinkedList\n");

        LinkedList<String> ll1 = new LinkedList<String>();
        ll1.add("t1");
        ll1.add("t2");
        Iterator ll1Itr = ll1.iterator();

        while ( ll1Itr.hasNext()) {
            System.out.println(ll1Itr.next());
        }
        //Stack
        System.out.println("\nStack\n");

        Stack<String> stack1 = new Stack<String>();
        stack1.push("s1");
        stack1.push("s2");

        Iterator sItr = stack1.iterator();

        while (sItr.hasNext()) {
            System.out.println(sItr.next());
        }


        //Vector
        System.out.println("\nVector\n");

        Vector<String> v1 = new Vector<String>();
        v1.add("v1");
        v1.add("v2");


        Iterator vItr = v1.iterator();

        while (vItr.hasNext()) {
            System.out.println(vItr.next());
        }

        //Queue/PriorityQueue
        System.out.println("\nPriorityQueue\n");

        PriorityQueue<String> pq1 = new PriorityQueue<String>();
        pq1.add("pq1");
        pq1.add("pq2");

        Iterator pqItr = pq1.iterator();

        while (pqItr.hasNext()) {
            System.out.println(pqItr.next());
        }

        System.out.println("\nArrayDequeue\n");

        ArrayDeque<String> adeq = new ArrayDeque<String>();
        adeq.add("adeq1");
        adeq.add("adeq2");

        Iterator adeqItr = adeq.iterator();

        while (adeqItr.hasNext()) {

            System.out.println(adeqItr.next());
        }

        HashSet<String> hs1 = new HashSet<String>();
        hs1.add("hs2");
        hs1.add("ab1");

        Iterator hsItr = hs1.iterator();

        while (hsItr.hasNext()) {
            System.out.println(hsItr.next());
        }
        System.out.println("\nLinkedHashSet\n");

        LinkedHashSet<String> lhs1 = new LinkedHashSet<String>();
        lhs1.add("lhs1");
        lhs1.add("abc");

        Iterator lhs1Itr = lhs1.iterator();

        while (lhs1Itr.hasNext()) {
            System.out.println(lhs1Itr.next());
        }

        System.out.println("\nTreeSet\n");
        TreeSet<String> ts1 = new TreeSet<String>();
        ts1.add("ts1");
        ts1.add("ts2");
        ts1.add("abc");
        ts1.add("ds1");

        Iterator ts1Itr = ts1.iterator();
        while (ts1Itr.hasNext()) {
            System.out.println(ts1Itr.next());
        }

        System.out.println("\nHashMap\n");

        HashMap<String,String> hm1 = new HashMap<String,String>();
        hm1.put("k1","v1");
        hm1.put("k4","v4");
        hm1.put("k3","v3");

        for ( String i: hm1.keySet()) {
            System.out.println(hm1.get(i));
        }

        System.out.println("\nLinkedHashMap\n");

        LinkedHashMap<String,String> lhm1 = new LinkedHashMap<String, String>();
        lhm1.put("lk1","lv1");
        lhm1.put("lk4","lv4");
        lhm1.put("lk3","lv3");
        lhm1.put("lk2","lv2");

        for (String s:lhm1.keySet()) {
            System.out.println(lhm1.get(s));
        }

        System.out.println("\nTreeMap\n");

        TreeMap<String,String> tm1 = new TreeMap<String, String>();
        tm1.put("tmk1","tmv1");
        tm1.put("tmk4","tmv4");
        tm1.put("tmk3","tmv3");
        tm1.put("tmk2","tmv2");

        for (String ts: tm1.keySet()) {
            System.out.println(tm1.get(ts));
        }

        System.out.println("\nHashTable\n");

        Hashtable<String,String> ht1 = new Hashtable<String, String>();

        ht1.put("htk1","htv1");
        ht1.put("htk4","htv4");
        ht1.put("htk6","htv6");
        ht1.put("htk2","htv2");

        for (String hts: ht1.keySet()) {
            System.out.println(ht1.get(hts));
        }

        System.out.println("\nProprties\n");

        Properties prop1 = new Properties();
        prop1.put("pk1","pv1");
        prop1.put("pk4","pv4");
        prop1.put("pk3","pv3");
        prop1.put("pk2","pv2");

        Set propset1 = prop1.keySet();
        Iterator propsetItr = propset1.iterator();

        while (propsetItr.hasNext()) {
            String str1 = (String) propsetItr.next();
            System.out.println(prop1.get(str1));
        }






    }
}
