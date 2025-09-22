public class ProductOfPositiveNumbersOnly {
    public static void main(String[] args) {
        int[] nums = {-3, 2, -5, 4, 6};
        int product = 1;

        for (int n : nums) {
            if (n > 0) {
                product *= n;
            }
        }
        System.out.println("Product of positive numbers = " + product);

    }    
}
