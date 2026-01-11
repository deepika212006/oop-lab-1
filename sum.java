
// 1) Write an application that ask the user to enter two integer, obtain them from user and print their sum, product, 
// difference and quotient and must be use package concept in this application. 
import java.util.*;

public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two integers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        if (b == 0) {
            System.out.println("Quotient is: Infinity, division by zero");
        } else {
            int quotient = a / b;
            System.out.println("Quotient is: " + quotient);
        }
        System.out.println("Sum is: " + sum);
        System.out.println("Difference is: " + difference);
        System.out.println("Product is: " + product);
    }
}