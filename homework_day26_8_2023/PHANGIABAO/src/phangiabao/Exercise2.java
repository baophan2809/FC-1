package phangiabao;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input n: ");
        int n = sc.nextInt();
        printN(n);
    }
    public static void printN(int n) {
        for (int i = 1; i <= n; i++) {
            for (int k = i; k >= 1; k--) {
                System.out.print(k + " ");
            }
            System.out.println("");
        }
    }
}
