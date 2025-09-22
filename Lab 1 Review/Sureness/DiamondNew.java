import java.util.Scanner;

public class DiamondNew {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask user for input
        System.out.print("Enter the number of rows for the diamond (half height): ");
        int n = sc.nextInt();

        // Upper half
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) System.out.print(" ");
            for (int k = 1; k <= (2*i-1); k++) System.out.print("*");
            System.out.println();
        }

        // Lower half
        for (int i = n-1; i >= 1; i--) {
            for (int j = n; j > i; j--) System.out.print(" ");
            for (int k = 1; k <= (2*i-1); k++) System.out.print("*");
            System.out.println();
        }

        sc.close();
    }
}
