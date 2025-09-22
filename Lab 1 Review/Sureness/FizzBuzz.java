import java.util.Scanner;
class FizzBuzz{
   public static void main(String[]args){
       Scanner input = new Scanner(System.in);
       System.out.print("Enter upper: ");
       int upper = input.nextInt();
       
       for(int x = 1; x <= upper; x++) {
           if (x % 3 == 0 && x % 5 == 0) {
               System.out.println("Fizzbuzz");
           }
           
           else if (x % 3 == 0) {
               System.out.println("Fizz");
           }
           
           else if (x%5 == 0) {
               System.out.println("Buzz");
           }
           
           else {
               System.out.println(x);
           }
       }
   }
}