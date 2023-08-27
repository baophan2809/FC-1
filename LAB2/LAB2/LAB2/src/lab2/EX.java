/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class EX {

    public static void main(String[] args) {
        //EX1
        for (int i = 1; i <= 6; i++) {
            System.out.println(i + " squared = " + (i * i));
        }

        //EX2
        System.out.println("+----+");
        for (int i = 1; i <= 3; i++) {
            System.out.println("\\    /");
            System.out.println("/    \\");
        }
        System.out.println("+----+");

        //EX3
        System.out.print("T-minus ");
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + ", ");
        }
        System.out.println("blastoff!");
        System.out.println("The end.");

        //EX4
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        //EX5
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        //EX6
        int n = 91;
        int factor = 2;
        while (n % factor != 0) {
            factor++;
        }
        System.out.println("First factor is " + factor);

        //EX7
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            System.out.print("Enter a number (0 to quit): ");
            num = sc.nextInt();
            sum += num;
        } while (num != 0);
        System.out.println("The sum is: " + sum);

        //FIX EX7
        int sum1 = 0;
        int num1 = 1;
        while (num1 != -1) {
            sum1 += num1;
            System.out.print("Enter a number (-1 to quit): ");
            num1 = sc.nextInt();
        }
        System.out.println("The sum is: " + sum1);

        //EX8
        String phrase;
        do {
            System.out.println("Type yout password");
            phrase = sc.next();
        } while (!phrase.equals("duytan"));

    }
}
