package Homeworks;

import java.util.Scanner;

public class Week1Task2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Input three different numbers please!");

        System.out.println("Input your first number: ");
        int firstNum = sc.nextInt();

        System.out.println("Input your second number: ");
        int secondNum = sc.nextInt();

        if (firstNum == secondNum) {

            System.out.println("Numbers must be different!");
            return;
        } else {

            System.out.println("Input your third number: ");
            int thirdNum = sc.nextInt();


            if (thirdNum == firstNum || thirdNum == secondNum) {

                System.out.println("Numbers must be different!");
                return;
            }

            if (firstNum > secondNum && firstNum > thirdNum) {

                System.out.println("The biggest is the first number!");

            } else if (secondNum > firstNum && secondNum > thirdNum) {

                System.out.println("The biggest is the second number!");
            } else if (thirdNum > secondNum) {

                System.out.println("The biggest is the third number!");
            }
        }

    }
}