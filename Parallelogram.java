package Assignment.JavaDay2Conditions;

import java.util.Scanner;

// 5. Area Of Parallelogram

public class Parallelogram{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double b = sc.nextInt();
        double h = sc.nextInt();

        double area = b*h;
        System.out.println("Area of parallelogram = "+ area);
        
    }
}