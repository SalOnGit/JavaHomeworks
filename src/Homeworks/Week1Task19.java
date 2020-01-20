package Homeworks;

import java.util.Scanner;

public class Week1Task19 {

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        System.out.print("Input the number from 1 till 99: ");

        int number = sc.nextInt();

        if (!(number > 1 && number < 99)) {

            System.out.println("Enter the number from 1 to 99 please!");
        }
    }
}
