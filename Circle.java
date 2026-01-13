// Q4) Write an application that input from the user that the radius of the circle is an integer and the print the circle 
// diameter , circumfrence and area using the floating point value 3.14159 for math.Pi(You can also use the 
// predefined constant math.pi for the value of pi.) 

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        System.out.println("enter the radius of circle:");
        Scanner input = new Scanner(System.in);
        float radius = input.nextFloat();
        System.out.println("Diameter of circle is:" + (2 * radius));
        System.out.println("Circumference of circle is:" + (2 * Math.PI * radius));
        System.out.println("Area of circle is:" + (Math.PI * Math.pow(radius, 2)));
    }
}
