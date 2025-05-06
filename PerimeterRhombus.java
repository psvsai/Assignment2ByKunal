package Assignment.JavaDay2Conditions;

import java.util.Scanner;

// 13. Perimeter Of Rhombus p = 4a;


public class PerimeterRhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();

        double perimeter = 4*a;
        System.out.println("Perimeter of a Rhombus = " + perimeter);
    }
    
}
