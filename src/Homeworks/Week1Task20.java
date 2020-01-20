package Homeworks;

import java.util.Scanner;

public class Week1Task20 {

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        System.out.print("Enter the power of wind: ");

        int powWind = sc.nextInt();

        switch (powWind) {

            case 1:
                System.out.println("The wind is low from 1 to 4 m/s");
                return;
            case 2:
                System.out.println("The wind is moderate from 5 to 10 m/s");
                return;
            case 3:
                System.out.println("The wind is high from 9 to 18 m/s");
                return;
            case 4:
                System.out.println("The wind is hurricane from 19");
                return;
            default:
                System.out.println("Enter the number from 1 to 4!");

        }

    }
}
