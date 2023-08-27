package phangiabao;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input n: ");
        int n = sc.nextInt();
        if (check(n) == false) {
            System.out.println(n + " not a prime number");
        } else {
            System.out.println(n + "is prime number");
        }
        prime100();
    }

    public static boolean check(int n) {
        if (n < 2)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void prime100() {
        int count = 0;
        System.out.print("Generate the first 100 prime numbers: ");
        for (int i = 1;; i++) {
            if (count > 100)
                break;
            if (check(i)) {
                System.out.print(i + " ");
                count++;
            }
        }
    }
}
