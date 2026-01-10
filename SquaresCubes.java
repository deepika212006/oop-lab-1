// Q6)Write an application that calculate the square and cubes of number from 0to10 and print the resulting value 
// in table format. 

import java.util.Scanner;

public class SquaresCubes {
    public static void main(String[] args) {
        System.out.printf("Number\tSquare\tCube\n");
        for (int i = 0; i <= 10; i++) {
            System.out.printf("%d\t%d\t%d\n", i, (int) Math.pow(i, 2), (int) Math.pow(i, 3));
        }
    }
}
