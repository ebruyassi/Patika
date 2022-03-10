package com.company;
import java.util.Scanner;

class Main {

    public static void main (String[] args) {
        int math,physics,chemistry,turkish,history,music;

        Scanner scan= new Scanner(System.in);
        System.out.println("Enter your math course grade:");
        math=scan.nextInt();

        System.out.println("Enter your physics course grade:");
        physics=scan.nextInt();

        System.out.println("Enter your chemistry course grade:");
        chemistry=scan.nextInt();

        System.out.println("Enter your Turkish course grade:");
        turkish=scan.nextInt();

        System.out.println("Enter your history course grade:");
        history=scan.nextInt();

        System.out.println("Enter your music course grade:");
        music=scan.nextInt();

        double average=(math+physics+chemistry+turkish+history+music)/6.0;
        System.out.println("Your Average: "+average);

        String result = (average > 60) ? "Passed" : "Fail";
        System.out.print(result);

        scan.close();
    }
}

