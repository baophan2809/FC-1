package maybaidocla;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        System.out.println("Kieu int: " + n);
        System.out.println("Kieu float: " + (float)n);
        System.out.println("Kieu double: " + (double)n);
        System.out.println("Kieu string: " + String.valueOf(n));
        sc.close();
    }
}
