package Assignment.JavaDay2Conditions;

import java.util.Scanner;

// 4. Area Of Isosceles Triangle a = b/2 * square root(4a(square)*b(square))

public class IsoscelesTriangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt();
        double b = sc.nextInt();

        double c = 4;

        double area = b/4 * Math.sqrt(c*(a*a)-(b*b));
        System.out.println("Area of Isosceles Triangle = " + area);
    }
}
