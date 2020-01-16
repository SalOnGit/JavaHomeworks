package Homeworks;

import java.util.Scanner;

public class Week1Task1 {

    public static void main(String[] args) {

        System.out.println("Input time of day: ");

        Scanner sc = new Scanner(System.in);

        int timeOfDay = sc.nextInt();

        if (timeOfDay >= 9 && timeOfDay <= 18) {

            System.out.println("I am on work now!");
        }
        else
        {
            System.out.println("I am rest now!");
        }
    }
}