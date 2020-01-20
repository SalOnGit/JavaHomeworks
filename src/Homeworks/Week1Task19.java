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

        if (number == 1 || number%10 == 1) {

            System.out.println(number + " kopeyka");
        }

        if ((number >= 2 && number <= 4) || (number%10 >= 2 && number%10 <= 4)) {

            System.out.println(number + " kopeyki");
        }

        if ((number >= 5 && number <= 14) || number%10 >= 5 || number%10 == 0) {

            System.out.println(number + " kopeek");

        }

    }
}
