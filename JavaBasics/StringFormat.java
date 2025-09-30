public class StringFormat {
    public static void main(String[] args) {
        double measure = 129.9875;
        String result = String.format("%.2f cm", measure);

        System.out.println(measure);
        System.out.println(result);

        //output
        //129.9875
        //129.99 cm

        // %n is used for new line
        System.out.printf("%.2f%n", 3.14159);   // 3.14
        System.out.printf("%8.2f%n", 3.14159);  // "    3.14" (right aligned, width=8)
        System.out.printf("%-8.2f%n", 3.14159); // "3.14    " (left aligned)

        System.out.printf("%d%n", 123);     // 123
        System.out.printf("%8d%n", 123);    // "     123" (width 8, right aligned)
        System.out.printf("%-8d%n", 123);   // "123     " (left aligned)
        System.out.printf("%08d%n", 123);   // "00000123" (zero-padded)

        System.out.printf("%s%n", "Hello");     // Hello
        System.out.printf("%10s%n", "Hi");      // "        Hi" (right aligned)
        System.out.printf("%-10s%n", "Hi");     // "Hi        " (left aligned)
        System.out.printf("%.3s%n", "Hello");   // Hel (max width 3 chars)

        System.out.printf("%+d%n", 123);    // +123
        System.out.printf("%,d%n", 1000000);// 1,000,000
        System.out.printf("%010d%n", 123);  // 0000000123


    }
}
