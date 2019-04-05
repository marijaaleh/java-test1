package com.company;

public class Main {

    public static void main(String[] args) {
	//  The first few Fibonacci numbers are: 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, .... etc.
        //  To create a really beautiful spiral-logo, the designer needs at least 1000 Fibonacci numbers for reference.

        //Create an application that:

        //prints 1000 Fibonacci numbers

        int fibCount = 40;
        int a = 0;
        int b = 1;
        int i;



        for (i=1;i<40; ++i){
            System.out.println(a);
            int next = a+b;
            a = b;
            b = next;
        }
    }
}
