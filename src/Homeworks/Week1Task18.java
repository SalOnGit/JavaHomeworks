package Homeworks;

import java.util.Scanner;

public class Week1Task18 {

    public static void main(String[] args) {
        float priceConv = 0.7f;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the duration of your conversation in minutes: ");
        float timeConv = sc.nextFloat();

        System.out.print("Enter the day of the week: ");
        int dayConv = sc.nextInt();

        float totalPrice = timeConv * priceConv; //  Total price for conversation without sale

        if (dayConv == 6 || dayConv == 7) {

            totalPrice = totalPrice - (totalPrice * 20 / 100);
            System.out.println("Today is weekend! your price for the conversation  with sale 20% is " + totalPrice + " UAH");

        } else {

            System.out.println("Your price for the conversation is " + totalPrice + " UAH");
        }
    }
}
