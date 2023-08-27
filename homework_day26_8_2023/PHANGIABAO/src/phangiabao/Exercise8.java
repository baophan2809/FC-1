package phangiabao;

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input n: ");
        int n = sc.nextInt();
        System.out.println("The reverse number of " + n + " is: " + reverse(n));
    }

    public static int reverse(int n) {
        int reverseNumber = 0;
        int numeral = 0;
        while (n > 0) {
            numeral = n % 10;
            reverseNumber = reverseNumber * 10 + numeral;
            n /= 10;
        }
        return reverseNumber;
    }
}

