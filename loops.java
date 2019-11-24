public class loops {

    public static void main(String args[]) {
        boolean bo=(1>0);
        if (bo) {
            System.out.println("Condition is true");
        }

        int i=3;
        switch(i) {
            case 5:
                System.out.println("Do things for case 5");
                break;

            default:
                System.out.println("For default case");
                break;
        }

        while (++i<10) {
            System.out.println("current val of i is" + i);
        }

        do {
            System.out.println("current val of i is" + i);
        }while(i++<15);

        for (i=0;i<10;i++) {
            System.out.println("my i val" + i);
        }
    }
}
