public class DataTypes {
    // function with return
    public static int add(int a, int b) {
        return a + b;
    }

    // function without return
    public static void greet(String name) {
        System.out.println("Hello " + name);
    }



    public static void main(String[] args) {
        int x = 1;

        if (x > 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Non-positive");
        }

        switch (x) {
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            default: System.out.println("Other day");
        }

        // for loop
        for (int i = 0; i < 5; i++) {
            System.out.print(i);
        }
        System.out.print("\n");

        // while loop
        int j = 0;
        while (j < 5) {
            System.out.print(j);
            j++;
        }
        System.out.print("\n");

        // do-while
        int k = 0;
        do {
            System.out.print(k);
            k++;
        } while (k < 5);
        System.out.print("\n");


        System.out.println("The sum is: " + add(5, 3));
        greet("Ricco");


        int[] nums = {1, 2, 3, 4, 5};

    // accessing elements
    System.out.println(nums[0]); // 1

    // traversing
    for (int i = 0; i < nums.length; i++) {
        System.out.print(nums[i] + " ");
    }

    // enhanced for-loop
    for (int n : nums) {
        System.out.print(n + " ");
    }

    int[][] matrix = {
        {1, 2, 3},
        {4, 5, 6}
    };

    System.out.println(matrix[1][2]); // 6


    }
}
