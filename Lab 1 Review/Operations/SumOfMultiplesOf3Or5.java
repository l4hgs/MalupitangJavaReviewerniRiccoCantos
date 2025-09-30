public class SumOfMultiplesOf3Or5 {
    public static void main(String[] args) {
        int sum = 0;
        int size = 20;

        for (int i = 1; i <= size; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        System.out.println("Sum of multiples of 3 or 5 = " + sum);

    }
}
