package Homeworks;

public class Week1Task22 {

    public static void main(String[] args) {

       int number = 123321;

       int num1 = number/100000;
       int num2 = number/10000%10;
       int num3 = number/1000%10;
       int num4 = number/100%10;
       int num5 = number/10%10;
       int num6 = number%10;

       if (num1 + num2 + num3 == num4 + num5 + num6) {

           System.out.println("Congratulations! Your number is happy! )");
       } else {

           System.out.println("Sorry. Your number isn't happy (");
       }

    }
}
