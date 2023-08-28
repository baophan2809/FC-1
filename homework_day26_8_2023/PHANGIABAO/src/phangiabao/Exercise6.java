package phangiabao;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input n: ");
        int n = sc.nextInt();
        if (check(n) == false) {
            System.out.println(n + " not a perfect number");
        } else {
            System.out.println(n + "is perfect number");
        }
        printNPerfect(n);
    }

    public static boolean check(int n) {
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0)
                sum += i;
        }
        return sum == n;
    }

    public static void printNPerfect(int n) {
        System.out.print(n + " first perfect number: ");
        int count = 0;
        for (int i = 1;; i++) {
            if (count == n)
                break;
            if (check(i)) {
                System.out.print(i + " ");
                count++;
            }
        }
    }
}
