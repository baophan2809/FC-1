package phangiabao;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input n: ");
        int n = sc.nextInt();
        System.out.println("Sum of number numerals of " + n + " is: " + computeSum(n));
    }

    public static int computeSum(int n) {
        int sum = 0;
        int numeral = 0;
        while (n > 0) {
            numeral = n % 10;
            sum +=numeral;
            n /= 10;
        }
        return sum;
    }
}
