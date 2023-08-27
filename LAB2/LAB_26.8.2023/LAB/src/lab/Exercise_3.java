/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Exercise_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a, b, c: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double p = a + b + c;//chu vi tam giac
        double ans = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        System.out.println("s = " + ans);
    }
}
