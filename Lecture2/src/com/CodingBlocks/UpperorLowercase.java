package com.CodingBlocks;

import java.util.Scanner;

public class UpperorLowercase {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        //System.out.println(ch);
        if('A'<=ch && ch <='Z'){
            System.out.println("Uppercase");
    }
        else if('a'<=ch && ch <='z'){
            System.out.println("Lowercase");
        }
        else{
            System.out.println("Invalid");
        }
    }
}
