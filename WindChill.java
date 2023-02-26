package assignments.CorejavaAndFunctionalprogram.FunctionalProgram;

import java.util.Scanner;

public class WindChill {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter temperature : ");
        double t = s.nextDouble();
        System.out.println("Enter wind speed : ");
        double v = s.nextDouble();
        temperature(t, v);
    }
    public static void temperature(double t, double v){

        double w = 35.74 + (0.6215 * t) + (0.4275 * t - 35.75) * Math.pow(v, 0.16);  //Wind Chill

        if ((t <= 50) && (v <= 120) && (v >= 3)) {
            System.out.println("Wind Chill : " + w);
        }

    }
}