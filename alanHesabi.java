package com.company;
import java.util.Scanner;

class Main {

    public static void main (String[] args) {
        int a,b,c;
        double u,area;

        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the length of first edge:");
        a=scan.nextInt();
        System.out.println("Enter the length of second edge:");
        b=scan.nextInt();
        System.out.println("Enter the length of third edge:");
        c=scan.nextInt();
        u=(a+b+c)/2;
        area=u*(u-a)*(u-b)*(u-c);



        System.out.print("Alan: "+Math.sqrt(area));

        scan.close();
    }
}

