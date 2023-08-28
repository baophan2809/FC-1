package essay_quiz1_phangiabao;

import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        checkMark(n);
    }

    public static void checkMark(int n) {
        if (n >= 50) {
            System.out.println("PASS");
        } else
            System.out.println("FAIL");

    }
}
