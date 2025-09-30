public class ProductOdd {
    public static void main(String[] args) {
        int size = 5;
        int product = 1;

        for (int i = 1; i <= size; i++) {
            if (i % 2 != 0) {  // conditional
                product *= i;
            }   
        }
        System.out.println("Product of odd numbers = " + product);

    }
}
