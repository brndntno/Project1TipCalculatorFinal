import java.util.Scanner;
import java.util.ArrayList;
public class TipCalculator {
    // welcomes user and asks for how many people are in their group and what their tip percentage is
    public static void main(String[] args) {
        System.out.println("Welcome to the tip calculator!");
        Scanner scan = new Scanner(System.in);
        System.out.print("How many people are in your group: ");
        int numPeople = scan.nextInt();
        System.out.print("What's the tip percentage? (0-100): ");
        int tipPercentage = scan.nextInt();

        // initializes and assigns variables + calculates total cost + determines good deal or not(if else)
        double cost = 0;
        double totalCost = 0;
        String item;
        ArrayList<String> items = new ArrayList<>(); // initializes and assigns ArrayList
        while (cost != -1) { // stops -1 from being considered as cost or item
            System.out.print("Enter a cost in dollars and cents, e.g. 12.50 (-1 to end): ");
            cost = scan.nextDouble();
            if (cost != -1) {
                System.out.print("Enter the item: ");
                item = scan.next();
                items.add(item);
                scan.nextLine();
                if (cost > 10) {
                    System.out.println("That's expensive for an item!");
                } else {
                    System.out.println("You're getting a good deal!");
                }
                totalCost += cost;
            }
        }
            // initializes and assigns variables for total tip, total bill with tip, etc...
            double totalTip = (totalCost * (tipPercentage * 0.01));
            double totalBillWTip = (totalCost + (totalCost * (tipPercentage * 0.01)));
            double perPersonCostB4Tip = (totalCost / numPeople);
            double tipPerPerson = ((totalCost * (tipPercentage * 0.01)) / numPeople);
            double totalCostPerPerson = ((totalCost / numPeople) + ((totalCost * (tipPercentage * 0.01)) / numPeople));

            // prints statements for aformentioned terms
            System.out.println("-------------------------------");
            System.out.println("Total bill before tip: $" + ((Math.round(totalCost * 100)) / 100.0));
            System.out.println("Total percentage: " + tipPercentage + "%");
            System.out.println("Total tip: $" + ((Math.round(totalTip * 100)) / 100.0));
            System.out.println("Total bill with tip: $" + ((Math.round(totalBillWTip * 100)) / 100.0));
            System.out.println("Per person cost before tip: $" + ((Math.round(perPersonCostB4Tip * 100)) / 100.0));
            System.out.println("Tip per person: $" + ((Math.round(tipPerPerson * 100)) / 100.0));
            System.out.println("Total cost per person: $" + ((Math.round(totalCostPerPerson * 100)) / 100.0));

            System.out.println("Items ordered: " + items); // prints item list
    }
}


