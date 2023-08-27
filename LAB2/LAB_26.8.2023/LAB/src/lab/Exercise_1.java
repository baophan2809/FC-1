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
public class Exercise_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap x: ");
        double x = sc.nextDouble();
        double ans = Math.exp(x + Math.sin(2 * x) - Math.pow(x, 5));
        System.out.println("Answer: " + ans);
    }
}
