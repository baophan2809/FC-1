package maybaidocla;
import java.util.Scanner;
public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = 0.0;
        System.out.println("Nhap x: ");
        x = sc.nextDouble();
        double ans = Math.exp(x + Math.sin(2*x) - Math.pow(x, 5));
        System.out.println("Ket qua: " + ans);
        sc.close();
    }
}
