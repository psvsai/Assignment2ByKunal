package Assignment.JavaDay2Conditions;

import java.util.Scanner;

// 2. Area Of Triangle

public class AreaOfTriangle {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int b = sc.nextInt();
      int h = sc.nextInt();

      double area = (b*h)/2;
      System.out.println("Area of Triangle " + area);
    
   } 
}
