package Homeworks;

import java.util.Scanner;

public class Week1Task16 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the price of your product: ");
        float price = sc.nextFloat();

        if (price > 0 && price > 1000) {
            float sale = price*10/100;
            price = price - sale;

            System.out.println("Your price with sale is " + price + " UAH");
        } else {
            System.out.println("Your price is " + price + " UAH");
        }
    }
}
