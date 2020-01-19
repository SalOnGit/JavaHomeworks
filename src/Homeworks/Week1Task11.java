package Homeworks;

import java.util.Scanner;

public class Week1Task11 {

    public static void main(String[] args) {

        int num = 721;

        int num1 = num/100;
        int num2 = num/10%10;
        int num3 = num%10;

        System.out.println(num1 + "\n" + num2 + "\n" + num3);

        if (num1==num2 && num1==num3) {
            System.out.println("The digits is equal!");
        } else if (num1==num2) {
            System.out.println("The first and the second digits is equal");
        } else if (num1==num3) {
            System.out.println("The first and the third digits is equal");
        } else if (num2==num3) {
            System.out.println("The second and the third digits is equal");
        } else {

            System.out.println("All digits is different");
        }
    }
}
