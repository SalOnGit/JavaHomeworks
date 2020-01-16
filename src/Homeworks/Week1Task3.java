package Homeworks;

import java.util.Scanner;

public class Week1Task3 {

    public static void main(String[] args) {

        System.out.print("Enter the number please: ");

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if (num%7 == 0) {
            System.out.println(num * 2);
        }
    }
}