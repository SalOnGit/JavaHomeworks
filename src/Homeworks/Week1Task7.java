package Homeworks;

import java.util.Scanner;

public class Week1Task7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number please: ");

        int num1 = sc.nextInt();

        System.out.print("Enter the second number please: ");

        int num2 = sc.nextInt();

        if (num1 % num2 == 0) {

            System.out.println("True. The result of division is " + num1/num2 + " with remainder " + num1%num2);

        }

        else {

            System.out.println("False. The result of division is " + num1/num2 + " with remainder " + num1%num2);
        }

    }
}
