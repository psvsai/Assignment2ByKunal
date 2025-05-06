package Assignment.JavaDay2Conditions;

import java.util.Scanner;

// 16. Volume Of Cylinder v = pi*r*r*h

public class VolumeCylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double h = sc.nextDouble();

        double volume = Math.PI*r*r*h;

        System.out.println("Volume of Cylinder = " + volume);
    }
    
}
