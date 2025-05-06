package Assignment.JavaDay2Conditions;

import java.util.Scanner;

// 12. Perimeter Of Square p = 4s


public class PerimeterSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double s = sc.nextDouble();

        double perimeter = 4*s;
        System.out.println("Perimeter of a Square = " + perimeter);
    }
}
