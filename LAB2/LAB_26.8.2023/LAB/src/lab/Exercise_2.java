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
public class Exercise_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius;
        double area;
        double circumference;
        System.out.print("Nhap radius: ");
        radius = sc.nextDouble();
        area = Math.pow(radius, 2) * Math.PI;
        circumference = 2 * Math.PI * radius;
        System.out.println("Chu vi hinh tron: " + circumference);
        System.out.println("Dien tich hinh tron: " + area);
    }
}
