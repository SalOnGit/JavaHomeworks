package Homeworks;

import java.util.Scanner;

public class Week1Task6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number please: ");

        int num1 = sc.nextInt();

        System.out.print("Enter the second number please: ");

        int num2 = sc.nextInt();

        int res = num1 + num2;

        if (res >= 11 && res <= 19) {

            System.out.println("The sum of the numbers: " + res);

        }
    }
}
