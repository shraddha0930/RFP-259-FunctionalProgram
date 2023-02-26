package assignments.CorejavaAndFunctionalprogram.FunctionalProgram;

import java.util.Scanner;

public class SumOfThreeInteger {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of integer :");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the integers :");
        int triple_count=0;

        for (int i=0;i<n-2;i++) {
            for (int j=i+1;j< n-1;j++) {
                for (int k=j+1;k<n;k++) {
                    if (arr[i] + arr[j] + arr[k]==0) {
                        System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
                        triple_count++;
                    }

                }
            }
        }
        System.out.println("No. of distinct triplets " +triple_count);
    }
}