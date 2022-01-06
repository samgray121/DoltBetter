package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int miles;
        int hotdogsEaten;
        int languagesKnown;

        Scanner sc = new Scanner(System.in);

        System.out.println("How many miles can you run?");
        miles = Integer.parseInt(sc.nextLine());


        System.out.println("Oh yeah? I can run " + (miles * 2+1));

        System.out.println("How many hot dogs can you eat?");
        hotdogsEaten = Integer.parseInt(sc.nextLine());

        System.out.println("Oh yeah? I can eat " + (hotdogsEaten * 2 +1));

        System.out.println("How many languages do you know?");
        languagesKnown = Integer.parseInt(sc.nextLine());

        System.out.println("Cool story, I know " + (languagesKnown * 2+1));








    }
}
