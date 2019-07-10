package com.CodingBlocks;

public class Temp {
    public static void main(String[] args) {
        int Fmin = 0;
        int Fmax=300;
        int step=20;

        while(Fmin <=Fmax){
        int c=(int) ((5.0/9)*(Fmin-32));
        System.out.println(Fmin+ "\t" +c);
        Fmin=Fmin+step;

    }
}
}