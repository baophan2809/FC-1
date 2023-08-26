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
public class bt5 { 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input n: ");
        int n = sc.nextInt();
        switch (n) {
            case 5:
                System.out.print("Five\n");
            case 4:
                System.out.print("Four\n");
            case 3:
                System.out.print("Three\n");
            case 2:
                System.out.print("Two\n");
            case 1:
                System.out.print("One\n");
            default:
                System.out.print("No\n");
        }
    }

}
