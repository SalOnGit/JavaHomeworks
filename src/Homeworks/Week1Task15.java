package Homeworks;

import java.util.Scanner;

public class Week1Task15 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input the number of month: ");

        int month = sc.nextInt();

        if (month >= 1 && month <= 12) {

            switch (month) {

                case 1:
                    System.out.println("January");
                    return;
                case 2:
                    System.out.println("February");
                    return;
                case 3:
                    System.out.println("March");
                    return;
                case 4:
                    System.out.println("April");
                    return;
                case 5:
                    System.out.println("May");
                    return;
                case 6:
                    System.out.println("June");
                    return;
                case 7:
                    System.out.println("July");
                    return;
                case 8:
                    System.out.println("August");
                    return;
                case 9:
                    System.out.println("September");
                    return;
                case 10:
                    System.out.println("October");
                    return;
                case 11:
                    System.out.println("November");
                    return;
                case 12:
                    System.out.println("December");
                    return;
            }
        } else {

            System.out.println("Input the value from 1 to 12 please!");
        }
    }
}
