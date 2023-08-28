package essay_quiz1_phangiabao;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        check(n);
    }
    public static void check(int n) {
        if (n % 2 == 0) {
            System.out.println("So chan");
        }
        else System.out.println("So le");

    }
}
