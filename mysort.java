import java.util.ArrayList;

public class mysort {

    /**
     *
     * @param a
     */
    public void myBubbleSort(int[] a) {
        int number_of_passes = 0;
        for (int i=0;i<a.length;i++) {
            for (int j=1;j<a.length;j++) {
                number_of_passes++;
                if ( a[j-1] > a[j]) {
                    int tmp = a[j-1];
                    a[j-1] = a[j];
                    a[j] = tmp;
                }
                //printArray(a);
            }
        }
        System.out.println("\nBubble sort completed with Number of passes "+ number_of_passes);
    }

    /**
     *
     * @param a
     */
    public void myselectionsort(int[] a) {
        int number_of_passes=0;
        for(int i=0;i<a.length;i++) {
            int min_idx=i;
            for (int j=i+1;j<a.length;j++) {
                number_of_passes++;
                if ( a[j] < a[i]) {
                    min_idx=j;
                }
                //printArray(a);
            }
            int tmp=a[i];
            a[i]=a[min_idx];
            a[min_idx]=tmp;
        }
        System.out.println("\nSelection sort completed with Number of passes "+ number_of_passes);

    }

    public void myinsertionsort(int[] a) {
        int number_of_passes=0;
        for (int i=1;i<a.length;i++) {
            int key=a[i];
            int j=i-1;
            while (j>=0 && (a[j]>key)) {
                number_of_passes++;
                a[j+1]=a[j];
                j--;
                //printArray(a);
            }
            a[j+1]=key;

        }
        System.out.println("\nInsertion sort completed with Number of passes "+ number_of_passes);

    }

   // public void mymergesort (int[] a) {
    // }

    /**
     *
     * @param a
     */
    public void printArray(int[] a) {
        //System.out.println("\nArray length " + a.length);
        for (int i=0;i<a.length;i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    /**
     *
     * @param args
     */
    public static void main (String args[]) {
        int a[] = {2,7,45,3,6,9,3,60};
        int b[] =a.clone();
        mysort mysort1 = new mysort();
        System.out.println("\nBefore sorting using Bubblesort");
        mysort1.printArray(a);
        mysort1.myBubbleSort(a);
        System.out.println("After sorting using Bubblesort");
        mysort1.printArray(a);
        System.out.println("\n");
        a = b.clone();
        System.out.println("\nBefore sorting using Selectionsort");
        mysort1.printArray(a);
        mysort1.myselectionsort(a);
        System.out.println("After sorting using Selectionsort");
        mysort1.printArray(a);
        System.out.println("\n");

        a = b.clone();
        System.out.println("\nBefore sorting using Insertionsort");
        mysort1.printArray(a);
        mysort1.myinsertionsort(a);
        System.out.println("After sorting using Insertionsort");
        mysort1.printArray(a);

    }
}
