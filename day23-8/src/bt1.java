/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class bt1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in); 
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("a + b = " +(a+b));
        System.out.println("a - b = " +(a-b));
        System.out.println("a * b = " +(a*b));
        System.out.println("a / b = " +(a/b));
    }
    
}
