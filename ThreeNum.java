// Q3) write an application that input three integer from the user and obtain the sum, average,product,largest and 
// smallest of the numbers  using interface and abstract class concept. 

import java.util.Scanner;

public class ThreeNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three integers:");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int sum = a + b + c;
        float average = sum / 3.0f;
        int product = a * b * c;
        int largest = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
        int smallest = (a < b) ? (a < c ? a : c) : (b < c ? b : c);
        System.out.println("Sum is:" + sum);
        System.out.println("Average is:" + average);
        System.out.println("Product is:" + product);
        System.out.println("Largest is:" + largest);
        System.out.println("Smallest is:" + smallest);

    }

}
