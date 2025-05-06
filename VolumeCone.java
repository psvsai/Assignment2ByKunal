package Assignment.JavaDay2Conditions;

import java.util.Scanner;

// 14. Volume Of Cone Java Program v = pie r square h/3

public class VolumeCone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double h = sc.nextDouble();

        double Volume = Math.PI *r*r*h/3;
        System.out.println("Volume of Cone = " + Volume);
    }
}
