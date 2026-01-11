// Q3) write an application that input three integer from the user and obtain the sum, average,product,largest and 
// smallest of the numbers  using interface and abstract class concept. 

import java.util.Scanner;

class Sum {
    Sum(int a, int b, int c) {
        System.out.println("Sum is:" + (a + b + c));
    }
}

class Average {
    Average(int a, int b, int c) {
        System.out.println("Average is:" + (a + b + c) / 3.0);
    }
}

class Product {
    Product(int a, int b, int c) {
        System.out.println("Product is:" + (a * b * c));
    }
}

class Largest {
    Largest(int a, int b, int c) {
        int largest = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
        System.out.println("Largest is:" + largest);
    }
}

class Smallest {
    Smallest(int a, int b, int c) {
        int smallest = (a < b) ? (a < c ? a : c) : (b < c ? b : c);
        System.out.println("Smallest is:" + smallest);
    }
}

public class ThreeNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three integers:");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        Sum sumObj = new Sum(a, b, c);
        Average avgObj = new Average(a, b, c);
        Product prodObj = new Product(a, b, c);
        Largest largeObj = new Largest(a, b, c);
        Smallest smallObj = new Smallest(a, b, c);
    }
}
