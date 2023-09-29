import java.util.Scanner;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        int n = 2;
        double totalCost = 0;
        Scanner scan = new Scanner(System.in);
        double beforeTip = 0;
        double totalTip = 0;
        double tipPerPerson = 0;
        double costPerThing = 0;

        System.out.println("Welcome...");
        System.out.print("How many people are you sharing your meal with? ");
        int people = scan.nextInt();
        scan.nextLine();
        System.out.print("How much do you want to tip? ");
        int percent = scan.nextInt();
        scan.nextLine();
        if (percent < 10) {
            System. exit(0);
        }


        while (costPerThing != -1) {
            totalCost += costPerThing;
            System.out.print("Enter another cost + cents, type in -1 to end: ");
            costPerThing = scan.nextDouble();
        }


        if (totalCost > 0) {
            System.out.println("-------------------");
            System.out.println("Total bill before tip: $" + totalCost);
            System.out.println("Total percentage: " + percent + "%");
            totalTip =  percent * totalCost / 100;
            totalTip =Math.round(totalTip * Math.pow(10, n))
                    / Math.pow(10, n);
            System.out.println("Total tip: $" + totalTip);
            beforeTip =  totalCost / people;
            beforeTip =Math.round(beforeTip * Math.pow(10, n))
                    / Math.pow(10, n);
            System.out.println("Per person before tip: $" + beforeTip);
            tipPerPerson =  totalTip / people;
            tipPerPerson =Math.round(tipPerPerson * Math.pow(10, n))
                    / Math.pow(10, n);
            System.out.println("Tip per person: $" + tipPerPerson);
            System.out.println("Total cost per person: $" + (tipPerPerson + beforeTip));
        }
    }
}
