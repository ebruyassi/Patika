package com.company;
import java.util.Scanner;

class Main {

    public static void main (String[] args) {
        int price;
        double totalPrice,tax;

        Scanner scan= new Scanner(System.in);
        System.out.println("Enter tha product price:");
        price=scan.nextInt();
        tax=price*0.18;
        totalPrice=price+tax;


        System.out.print("KDV'li Fiyat: "+totalPrice+"\n"+"KDV: "+tax);

        scan.close();
    }
}

