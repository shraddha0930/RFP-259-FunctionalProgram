package assignments.CorejavaAndFunctionalprogram.FunctionalProgram;

import java.util.Scanner;

public class TwoDArray {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the total number of row : ");
        int m = scanner.nextInt();

        System.out.print("Enter the total number of column : ");
        int n = scanner.nextInt();

        int arr[][] = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Enter" +(m * n) +"Array Elements:" );
                arr[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Array : ");
        //to print array
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}