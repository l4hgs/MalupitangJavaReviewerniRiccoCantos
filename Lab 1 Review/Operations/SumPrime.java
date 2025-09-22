public class SumPrime {
    public static void main(String[] args) {
        int[] nums = {2, 3, 4, 5, 6, 7, 8, 9, 10};
    int sum = 0;

    for (int n : nums) {
        boolean isPrime = true;
        if (n < 2) isPrime = false;
        else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime) {
            sum += n;
        }
    }
    System.out.println("Sum of prime numbers = " + sum);

    }    
}
