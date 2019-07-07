package com.CodingBlocks;

public class DataTypesDemo {
    public static void main(String[] args) {
        byte b = 10;
        short sh = 20;
        int in = 30;
        long ln = 40;
        //b=sh;
        // b=in;
        // b=ln;
        sh = b;
        System.out.println(sh);
        // sh=in;
        // sh=ln;
        in = b;
        in = sh;
        //in=ln;
        ln = b;
        ln = sh;
        ln = in;

        //part 2

        b = 10;
        b = 127;
        b = (byte) 128;
        System.out.println(b);

        //part 3

        in = 1000000000;
        //in=100000000000;
        ln = 10000000000L;
        System.out.println(ln);

        //part 4

        sh = 32000;
        //part 5
        // float f=5.5;
        float f = 5.5f;
        System.out.println(f);
        double db = 6.5;

        //part 6

        in = (int) f;
        System.out.println(in);
        f = in;
        System.out.println(f);

        //part 7
        boolean bit = true;
        //bit=0;
        // bit=1;
        if (bit) {
            System.out.println("hello");
        } else {
            System.out.println("false");
        }
        bit = false;
        if (bit) {
            System.out.println("hello");
        } else {
            System.out.println("false");
        }

        if (in > 0) {
            System.out.println("greater");
        } else {
            System.out.println("equal or lesser");
        }

       /* if(1){
            System.out.println("nahi");
        } else{
            System.out.println("kiki");
        }*/

       //Part 8
        char c='a';
        c=99;//compiler assign corresponding character to ASCII value 99 in c
        System.out.println(c);
        //c=64000;
      //  System.out.println(c);
       // c=c+2;
        c=(char)(c+2);
        System.out.println(c);

        in=c;
        System.out.println(in);

        c=(char)68000;
        System.out.println(c);




    }
}