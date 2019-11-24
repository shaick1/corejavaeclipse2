package com.myshs;

import java.util.Arrays;

public class variables1 {

        public variables1(String name) {
            System.out.println("Inside constructor");
        }
        public  variables1() {
            System.out.println("inside no arg constructer1");
        }

        public static void main(String[] args) {
            System.out.println("Hi");
            for (int i=0;i<args.length;i++) {
                System.out.println((int)Math.sqrt(Integer.parseInt(args[i])));
            }

            variables1 v = new variables1();
            System.out.println(v);
            variables1 v1 = new variables1();
            System.out.println(v1);
            v1=v;
            System.out.println(v);
            byte b = 127;
            int i = 0;
            char c = 'a';
            short s = 1;
            long l = 00011010;
            float f = 1.3f;
            double d = 1.33;
            boolean bo = true;
            System.out.println("output is "+b+i+c+s+l+f+d+bo);

            if (i != 0) {
                System.out.println("i is not 0");
            }
            else {
                System.out.println("is is 0");
            }

            for (i=1;i<10;i++) {
                System.out.println(i);
            }

            while (bo) {
                System.out.println("b is " + bo);
                bo=false;
            }

            Integer number = new Integer(55);//int
            number = 56;
            System.out.println(number);

            String str1 = new String("test1");
            System.out.println(str1);

            StringBuffer stbuf = new StringBuffer("test2");
            StringBuilder stbul = new StringBuilder("test3");

            System.out.println(str1.toString()+stbuf.toString()+stbul);

            int[] a;
            a = new int[5];
            System.out.println(a[0]);
            System.out.println(a);
            System.out.println(a.toString());
            System.out.println(Arrays.toString(a));
            Arrays.fill(a,200);
            System.out.println(Arrays.toString(a));

        }

    }

