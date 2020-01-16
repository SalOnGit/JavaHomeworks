package Homeworks;

import java.util.Scanner;

public class Week1Task8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number please: ");

        int num1 = sc.nextInt();

        System.out.print("Enter the second number please: ");

        int num2 = sc.nextInt();

        if (num1%10 == num2%10) {

            System.out.println("True");
        } else {

            System.out.println("False");
        }

    }
}
