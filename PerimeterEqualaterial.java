package Assignment.JavaDay2Conditions;

import java.util.Scanner;

// 9. Perimeter Of Equilateral Triangle p = 3a


public class PerimeterEqualaterial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();

        double perimeter = 3*a;
        System.out.println("Perimeter of A Equilateral Triangle  = " + perimeter);
    }
}
