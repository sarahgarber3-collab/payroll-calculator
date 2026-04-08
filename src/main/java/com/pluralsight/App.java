package com.pluralsight;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name here: ");
        scanner.nextLine();
        String name = "Sarah";

        System.out.print("Enter hours worked: ");
        float hours = scanner.nextFloat();
        scanner.nextLine();

        System.out.print("Enter pay rate: ");
        float pay = scanner.nextFloat();
        scanner.nextLine();


        float grossPay = hours * pay;
        System.out.println(grossPay);
        System.out.println(name);



    }
}
