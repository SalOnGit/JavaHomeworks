package Homeworks;

import java.util.Scanner;

public class Week1Task4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number please: ");

        double num = sc.nextDouble();

        if (num > 0 && num < 1) {

            System.out.println("The number " + num + "is in range between 0 and 1");

        } else {

            System.out.println("The number " + num + "is NOT in range between 0 and 1");
        }
    }
}