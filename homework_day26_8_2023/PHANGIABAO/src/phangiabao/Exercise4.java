package phangiabao;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input n: ");
        int n = sc.nextInt();
        System.out.println(n +"! = " + N(n));
    }

    public static long N(int n) {
        if (n == 0) 
        return 1;
        return n * N(n - 1);
    }
}
