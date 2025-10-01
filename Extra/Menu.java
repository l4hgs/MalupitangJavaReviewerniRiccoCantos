import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Menu items
        String[] items = {"Coffee", "Tea", "Sandwich", "Cake", "Juice"};
        double[] prices = {50.0, 40.0, 120.0, 80.0, 60.0};

        System.out.println("=== Welcome to Ricco's Cafe ===");
        System.out.println("Here is our menu:");

        // Print menu
        for (int i = 0; i < items.length; i++) {
            System.out.printf("%d. %-10s - P%.2f\n", i + 1, items[i], prices[i]);
        }

        double total = 0;
        char choice;

        do {
            System.out.print("\nEnter the item number you want to order: ");
            int itemNumber = input.nextInt();

            if (itemNumber >= 1 && itemNumber <= items.length) {
                System.out.printf("You ordered: %s (P%.2f)\n", items[itemNumber - 1], prices[itemNumber - 1]);
                total += prices[itemNumber - 1];
            } else {
                System.out.println("Invalid choice, please select from the menu.");
            }

            System.out.print("Do you want to order another item? (y/n): ");
            choice = input.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        System.out.printf("\nYour total bill is: P%.2f\n", total);
        System.out.println("Thank you for visiting Ricco's Cafe!");
        
        input.close();
    }
}
