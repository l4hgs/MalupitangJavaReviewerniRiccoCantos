public class SumEven {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6};
        int sum = 0;

        for (int n : nums) {
            if (n % 2 == 0) {  // conditional
            sum += n;
            }
        }
        System.out.println("Sum of even numbers = " + sum);

    }
}
