package Assignment.JavaDay2Conditions;

// 15. Volume Of Prism v = b*h

import java.util.Scanner;

public class VolumePrism {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double b = sc.nextDouble();
        double h = sc.nextDouble();

        double volume = b*h;
        System.out.println("Volume of prism = " + volume);
    }
    
}
