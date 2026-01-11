// Q2) Write an application that asks user to enter two integer, obtain them from the user and display the larger 
// number followed by the word "is larger". if the numbers are equal, print the" the number are equal". Path and 
// Classpath Concept use in this Application. 

import java.util.Scanner;

public class Larger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two integers:");
        int a = input.nextInt();
        int b = input.nextInt();
        if (a > b) {
            System.out.println(a + " is larger");
        } else if (b > a) {
            System.out.println(b + " is larger");
        } else {
            System.out.println("The numbers are equal");
        }
    }
}
