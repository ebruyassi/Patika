package com.company;
import java.util.Scanner;

class Main {

    public static void main (String[] args) {

        double distance,totalPrice;

        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the distance:");
        distance=scan.nextDouble();

        totalPrice=10+distance*2.20;

        if(totalPrice<20){
            System.out.print("Ödenecek Tutar: "+20);
        }else {
            System.out.print("Ödenecek Tutar: "+totalPrice);

        }
        
        scan.close();
    }
}

