package Homeworks;

import java.util.Scanner;

public class Week1Task5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter thre first number please: ");

        int num1 = sc.nextInt();

        System.out.print("Enter thre first number please: ");

        int num2 = sc.nextInt();

        if (num1 > num2) {

            int res = num1 - num2;
            System.out.println("The subtraction of the numbers is " + res);

        } else {

            int res = num1 + num2;
            System.out.println("The sum of the numbers is " + res);
        }
    }
}
