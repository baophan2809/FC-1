package phangiabao;

import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input 3 integer numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.print("Highest Common Factor (HCF) of three numbers : " + a + " " + b + " " + c + " is: "
                + highestFactors(a, b, c));
    }

    public static int highestFactors(int a, int b, int c) {
        for (int i = Math.min(a, Math.min(b, c)); i > 1; i--) {
            if (a % i == 0 && b % i == 0 && c % i == 0)
                return i;
        }
        return 1;
    }

}
