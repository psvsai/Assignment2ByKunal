package Assignment.JavaDay2Conditions;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double l = sc.nextInt();
        double b = sc.nextInt();

        double area = l*b;
        System.out.println("Are of rectangle = " + area);
        
    }
}
