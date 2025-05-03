package Assignment.JavaDay2Conditions;

import java.util.Scanner;

// 6. Area Of Rhombus

public class Rhombus {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        double p = sc.nextDouble();
        double q = sc.nextDouble();

        double area = p*q/2;
        System.out.println("Area of Rhombus = " + area);
    }
    
}
