import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome...");
        System.out.print("How many people are you sharing your meal with? ");
        int people = scan.nextInt();
        System.out.print("How much do you want to tip? It is recommended to tip above 15 percent! ");
        int percent = scan.nextInt();
        System.out.print("Enter a cost + cents, type in -1 to end: ");
        double costPerThing = scan.nextDouble();

        while (costPerThing != -1.0 ) {
            System.out.print("Enter another cost + cents, type in -1 to end: ");
            costPerThing = costPerThing + scan.nextDouble();
        }

    }
}
