public class DiamondNumbers {
    public static void main(String[] args) {
        int n = 4;

        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= ((2*i)-1); k++) {
                System.out.print(i);
            }
            System.out.print("\n");
        }

        for (int i = n-1; i >= 1; i--) {
            for (int j = i; j <= n-1; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= ((2*i)-1); k++) {
                System.out.print(i);
            }
            System.out.print("\n");
        }
    }
}
