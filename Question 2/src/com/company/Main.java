package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       /* The potential clients are now piling in, and it is becoming painfully obvious, that the rented room will soon become too small, as it can only house 100 people. It would be impolite from us to turn people away, so let's make a program that does the dirty work for us.

        Create an appliction that:

        reads as input: the amount of people in the room
        reads as input: the amount of people still in the queue
        prints if every person in the queue can fit in the room*/

        Scanner sca = new Scanner(System.in);

        System.out.println("How many people are there in the room right now?");
        int inR = sca.nextInt();

        System.out.println("How many people are queueing?");
        int inQ = sca.nextInt();

        if ((inR+inQ)<=100){
            System.out.println("The queueing " + inQ + " people can come in");
        }
    }
}
