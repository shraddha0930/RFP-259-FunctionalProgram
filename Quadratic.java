package assignments.CorejavaAndFunctionalprogram.FunctionalProgram;

import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {


        double a, b, c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");
        a = scanner.nextDouble();

        System.out.println("Enter number:");
        b = scanner.nextDouble();

        System.out.println("Enter number:");
        c = scanner.nextDouble();

        double root1, root2;

        // calculate the determinant (b2 - 4ac)
        double determinant = b * b - 4 * a * c;

        // check if determinant is greater than 0
        if (determinant > 0) {

            // two real and distinct roots
            root1 = (-b + Math.sqrt(determinant)) / (2 * a);
            root2 = (-b - Math.sqrt(determinant)) / (2 * a);

            System.out.format("root1 ="+ root1 +" and root2 = " +root2);
        }

        // check if determinant is equal to 0
        else if (determinant == 0) {

            root1 = root2 = -b / (2 * a); /* two real and equal roots
             determinant is equal to 0
             so -b + 0 == -b*/
            System.out.format("root1 = root2 = ", root1);
        }

        // if determinant is less than zero
        else {

            // roots are complex number and distinct
            double real = -b / (2 * a);
            double imaginary = Math.sqrt(-determinant) / (2 * a);
            System.out.format("root1 ="+ real +"+" +imaginary);
            System.out.format("\nroot2 ="+ real +"+" +imaginary);
        }
    }
}
