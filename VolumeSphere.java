package Assignment.JavaDay2Conditions;

// 17. Volume Of Sphere  v= 4/3*pi*r cube

import java.util.Scanner;

public class VolumeSphere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter the value of radius");
        double r = sc.nextDouble();
        double volume = 1.3 *Math.PI*r*r*r;

        System.out.println("Volume of Sphere = " + volume);


    }
    
}
