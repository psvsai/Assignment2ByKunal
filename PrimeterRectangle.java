package Assignment.JavaDay2Conditions;

// 11. Perimeter Of Rectangle p = 2(l+w)


import java.util.Scanner;

public class PrimeterRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double l = sc.nextDouble();
        double w = sc.nextDouble();

        double perimeter = 2*(l+w);
        System.out.println("Perimter of a Rectangle = "+ perimeter);
    }
    
}
