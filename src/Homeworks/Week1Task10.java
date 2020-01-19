package Homeworks;

import java.util.Scanner;

public class Week1Task10 {

    static int cub (int a) {

        int result = a*a*a;
        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input the first number please: ");
        int num1 = sc.nextInt();

        System.out.print("Input the second number please: ");
        int num2 = sc.nextInt();

        System.out.print("Input the third number please: ");
        int num3 = sc.nextInt();

        if (num1 > 0) {

            num1 = cub(num1);
        } else {

            num1 = num1 * 0;
        }

        if (num2 > 0) {

            num2 = cub(num2);
        } else {

            num2 = num2 * 0;
        }

        if (num3 > 0) {

            num3 = cub(num3);
        } else {

            num3 = num3 * 0;
        }

        System.out.println("The first number - " + num1 + "\nThe second number - " + num2 + "\nThe third number - " + num3);

    }
}
