package Assignment.JavaDay2Conditions;

import java.util.Scanner;

// 7. Area Of Equilateral Triangle a = squarte root of 3  /4 * (side) square

public class EquilateralTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();

        double area = Math.sqrt(3)/4*(a*a);
        System.out.println("Area of Equilateral Triangle = " + area);
    }
}
