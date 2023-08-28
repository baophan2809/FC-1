package essay_quiz1_phangiabao;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            n = sc.nextInt();
        }while(n < 0 || n > 1000);  
        printPrime(n);
    }

    public static boolean check(int x) {
        if (x <= 1)
        return false;
        for (int i = 2; i <= x / 2; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void printPrime(int n) {
        for (int i = 0; i <= n; i++) {
            if (check(i))
                System.out.print(" " + i);
        }
    }
}
