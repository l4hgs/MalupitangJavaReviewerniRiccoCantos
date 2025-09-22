public class ProductOdd {
    public static void main(String[] args) {
        int[] nums = {2, 3, 4, 5, 6};
        int product = 1;

        for (int n : nums) {
            if (n % 2 != 0) {  // conditional
                product *= n;
            }   
        }
        System.out.println("Product of odd numbers = " + product);

    }
}
