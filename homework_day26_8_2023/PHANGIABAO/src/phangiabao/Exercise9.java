package phangiabao;

import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input n: ");
        int n = sc.nextInt();
        System.out.print("Prime factors of " + n + ": ");
        primeFactors(n);
    }
    // tham so divisor ban dau bang 2
    public static void primeFactors(int n) {
        primeFactors(n, 2);
    }
    public static void primeFactors(int n, int divisor) {
        
        if (n <= 1) {
            return;
        }
        // dam bao chi con cac thua so khac cua n de phan tich
        while (n % divisor == 0) {
            System.out.print(divisor + " ");
            n /= divisor;
        }
        //goi de quy: tang tham so divisor de tiep tuc duỵet
        primeFactors(n, divisor + 1);
    }
}
