public class mysearch {

    public int mylinearsearch(int[] a,int key) {
        int index=-1;
        for (int i=0;i<a.length;i++) {
            if (a[i] == key) {
                index=i;
                break;
            }
        }
        return index;
    }

    public static void main (String args[]) {
    int a[] = {2,7,45,3,6,9,3,60};
   mysearch mys = new mysearch();
   int found_in_index = mys.mylinearsearch(a,3);
   System.out.println("Fount in index "+ found_in_index);

}
}
