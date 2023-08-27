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
public class Suabai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        int num = 1;
        while (num != -1) {
            System.out.print("Enter a number (-1 to quit): ");
            num = sc.nextInt();
            if (num == -1)
                break;
            sum += num;
        }
        System.out.println("The sum is: " + sum);
    }

}
