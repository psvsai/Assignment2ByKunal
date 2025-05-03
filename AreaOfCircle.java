package Assignment.JavaDay2Conditions;

// 1. Area Of Circle Java Program a=3.17*r*r

import java.util.Scanner;

public class AreaOfCircle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of radius = ");
        int r = sc.nextInt();
       
        double area = Math.PI*r*r;

        System.out.println("Area of circle = "+ area);
        
    }
}