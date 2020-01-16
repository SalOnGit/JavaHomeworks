package Homeworks;

import java.util.Scanner;

public class Week1Task9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first side of triangle. \n a = ");

        int side1 = sc.nextInt();

        System.out.print("Enter the second side of triangle. \n b = ");

        int side2 = sc.nextInt();

        System.out.print("Enter the third side of triangle. \n c = ");

        int side3 = sc.nextInt();

        if (side1*side1 + side2*side2 == side3*side3) {

            System.out.println("The triagle is right");

        } else {

            System.out.println("The triagle isn't right");
        }

    }
}
