package Assignment.JavaDay2Conditions;

// 18. Volume Of Pyramid v = 1/3*b*h

import java.util.Scanner;

public class VolumePyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base = ");
        double b = sc.nextDouble();
        System.out.print("Enter the height = ");
        double h = sc.nextDouble();

        double area = b*b; 

        double volume = (1.0/3)*area*h;

        System.out.println("Volume of pyramid = " + volume);
    }
    
}
