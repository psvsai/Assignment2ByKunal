package Assignment.JavaDay2Conditions;

// 10. Perimeter Of Parallelogram p = 2(a+b);


import java.util.Scanner;

public class PerimiterParallelogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        double perimeter = 2*(a+b);
        System.out.println("Perimeter of A Parallelogram = " + perimeter);
    }
}
