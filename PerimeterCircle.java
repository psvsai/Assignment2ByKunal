package Assignment.JavaDay2Conditions;

import java.util.Scanner;

// 8. Perimeter Of Circle perimeter = 2 pie r

public class PerimeterCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();

        double perimeter = 2*Math.PI*r;
        System.out.println("Perimeter of a Circle is  = " + perimeter);
    }
}
