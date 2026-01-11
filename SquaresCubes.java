// Q6)Write an application that calculate the square and cubes of number from 0to10 and print the resulting value 
// in table format. 

//without classes and objects

// import java.util.Scanner;

// public class SquaresCubes {
//     public static void main(String[] args) {
//         System.out.printf("Number\tSquare\tCube\n");
//         for (int i = 0; i <= 10; i++) {
//             System.out.printf("%d\t%d\t%d\n", i, (int) Math.pow(i, 2), (int) Math.pow(i, 3));
//         }
//     }
// }

// with classes and objects
class Square {
    public double square(int n) {
        return Math.pow(n, 2);
    }
}

class Cube {
    public double cube(int n) {
        return Math.pow(n, 3);
    }
}

public class SquaresCubes {
    public static void main(String[] args) {
        System.out.println("Number\tSquare\tCube");
        Square s = new Square();
        Cube c = new Cube();
        for (int i = 0; i <= 10; i++) {
            System.out.println(i + "\t" + (int) s.square(i) + "\t" + (int) c.cube(i));
        }
    }
}