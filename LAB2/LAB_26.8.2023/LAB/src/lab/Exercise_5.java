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
public class Exercise_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cho phuong trinh ax^2 + bx + c = 0");
        System.out.print("Nhap a, b, c: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double delta = Math.pow(b, 2) - 4 * a *c;
        if (delta < 0) {
            System.out.println("Phuong trinh vo nghiem");
        }
        else if (delta == 0)
            System.out.println("Phuong trinh co nghiem kep x1 = x2 = " + (-b / (2*a)));
        else {
            System.out.println("Phuong trinh co 2 nghiem \n x1 = " + ((-b + Math.sqrt(delta))/(2 * a)) + "\n x2 = " + ((-b - Math.sqrt(delta))/(2 * a)));
        }
    }
}
