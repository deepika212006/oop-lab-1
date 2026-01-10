// Q5)Write an application that inputs one number consisting of five digits from the user, separate the number into 
// its individual digits and print the digit separates from one another for three spaces each. for example if the user 
// type the number 42335 the program should print ( 4 2 3 3 5). 

import java.util.Scanner;

public class SeparateDigits {
    public static void main(String[] args) {
        int count = 0;
        System.out.println("Enter a 5 digit number:");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int b = num; // storing the value of num in b for counting digits
        while (b != 0) {
            int a = b % 10;
            b = b / 10;
            count++;
        }
        if (count != 5) // checking whether the number is 5 digit or not
        {
            System.out.println("Please enter a valid 5 digit number");
            return;
        } else {
            for (int i = 0; i < 5; i++) {
                int digit = num / (int) Math.pow(10, 4 - i); // math is a class and pow is a method of math class
                System.out.print(digit + "   "); // return type of pow method is double so we are typecasting it to int
                num = num % (int) Math.pow(10, 4 - i);
            }
        }
        // input.close();
    }
}
