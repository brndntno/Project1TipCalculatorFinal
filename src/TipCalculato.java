import java.util.Scanner;
public class TipCalculato {
    public static void main(String[] args) {
        System.out.println("Welcome to the tip calculator!");
        Scanner scan = new Scanner(System.in);
        System.out.print("How many people are in your group: ");
        int numPeople = scan.nextInt();
        System.out.print("What's the tip percentage? (0-100): ");
        int tipPercentage = scan.nextInt();

        double cost = 0;
        double totalCost = 0;
        while (cost != -1) {
            System.out.print("Enter a cost in dollars and cents, e.g. 12.50 (-1 to end): ");
            cost = scan.nextDouble();
            totalCost += cost;
            System.out.print("Enter the item: ");
        }

        totalCost++;

        System.out.println("-------------------------------");
        System.out.println("Total bill before tip: $" + totalCost);
        System.out.println("Total percentage: " + tipPercentage + "%");
        System.out.println("Total tip: $" + ((Math.round((totalCost * (tipPercentage * 0.01)) * 100)) / 100));
        System.out.println("Total bill with tip: $" + (Math.round((totalCost + (totalCost * (tipPercentage * 0.01))) * 100) / 100));
        System.out.println("Per person cost before tip: $" + (Math.round((totalCost / numPeople) * 100) / 100));
        System.out.println("Tip per person: $" + (Math.round(((totalCost * (tipPercentage * 0.01)) / numPeople) * 100) / 100));
        System.out.println("Total cost per person: $" + (Math.round(((totalCost / numPeople) + ((totalCost * (tipPercentage * 0.01)) / numPeople)) * 100) / 100));
    }
}
