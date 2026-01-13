// 1) Write an application that ask the user to enter two integer, obtain them from user and print their sum, product, 
// difference and quotient and must be use package concept in this application. 

import java.util.Scanner;

class Sum {
    Sum(int a, int b) { // constructor to calculate sum
        System.out.println("Sum is:" + (a + b));
    }
}

class Difference {
    Difference(int a, int b) { // constructor to calculate difference
        System.out.println("Difference is:" + (a - b));
    }
}

class Product {
    Product(int a, int b) { // constructor to calculate product
        System.out.println("Product is:" + (a * b));
    }
}

class Quotient {
    Quotient(int a, int b) { // constructor to calculate quotient
        if (b != 0) {
            System.out.println("Quotient is:" + (a / b));
        } else {
            System.out.println("Cannot divide by zero");
        }
    }
}

public class TwoNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two integers:");
        int a = input.nextInt();
        int b = input.nextInt();
        Sum sumObj = new Sum(a, b); // constructor is called at the time of object creation
        Difference diffObj = new Difference(a, b);
        Product prodObj = new Product(a, b);
        Quotient quotObj = new Quotient(a, b);
    }
}
