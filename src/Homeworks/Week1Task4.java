package Homeworks;

import java.util.Locale;
import java.util.Scanner;

public class Week1Task4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Enter the number please (as a decimal use a dot): ");

        double num = sc.nextDouble();

        if (num > 0 && num < 1) {

            System.out.println("The number " + num + " is in range between 0 and 1");

        } else {

            System.out.println("The number " + num + " is NOT in range between 0 and 1");
        }
    }
}