package maybaidocla;

import java.util.Scanner;

public class bai2 {

    public static final double G = 9.18;
    public static final double PI = 3.14;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input length of the band that hangs oscillate: ");
        double l = sc.nextDouble();
        double ans = 2 * PI * Math.sqrt(l / G);
        System.out.println("The answer of t = " + ans);
        sc.close();
    }
}
