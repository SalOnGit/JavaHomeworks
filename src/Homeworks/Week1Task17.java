package Homeworks;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class Week1Task17 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input your height: ");
        float height = sc.nextFloat();

        System.out.print("Input your weight: ");
        float weight = sc.nextFloat();

        float resWeight = height - 100;

        if (weight > resWeight) {

            System.out.println("You weight is too big! You must loose " + (weight - resWeight) + " kg");

        } else if (weight < resWeight) {

            System.out.println("You weight is light! You must gain " + (resWeight - weight) + " kg");
        } else {

            System.out.println("Your weight is perfect!");
        }
    }

}
