package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Create an application that:
        //greets the user and asks for their name
        //politely echoes the user's name back, and invites them into the opening ceremony

        Scanner sca = new Scanner(System.in);
        System.out.println("Hey there! We are Cats on Longboards! What's your name?");
        String name = sca.next();

        System.out.println("We've been expecting you, " + name + "! Please join us at our upcoming lavish ceremony!" );
    }
}
