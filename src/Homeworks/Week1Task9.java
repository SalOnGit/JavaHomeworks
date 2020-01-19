package Homeworks;

import java.util.Scanner;

public class Week1Task9 {

    static int square(int a) {

        int result = a*a;
        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first side of triangle. \n a = ");

        int side1 = sc.nextInt();

        System.out.print("Enter the second side of triangle. \n b = ");

        int side2 = sc.nextInt();

        System.out.print("Enter the third side of triangle. \n c = ");

        int side3 = sc.nextInt();

        if (square(side1) + square(side2) == square(side3)) {

            System.out.println("The triangle is right");

        } else {

            System.out.println("The triangle isn't right");
        }
     }
}
