package essay_quiz1_phangiabao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = 0;
        try {
            month = sc.nextInt();
            if (month < 1 || month > 12) {
                System.out.println("Thang khong ton tai");
            } else
                System.out.println("Thang " + month + " co " + hienThiNgay(month) + " ngay");
        } catch (InputMismatchException except) {
            System.out.println("Loi nhap du lieu");
        }
    }

    public static int hienThiNgay(int month) {
        int day = 0;
        switch (month) {
            case 4:
            case 6:
            case 9:
            case 11:
                day = 30;
                break;
            case 2:
                Scanner check = new Scanner(System.in);
                System.out.print("Nhap nam: ");
                int nam = check.nextInt();
                if (nam % 400 == 0 || (nam % 100 != 0 && nam % 4 == 0))
                    day = 29;
                day = 28;
                break;
            default:
                day = 31;
        }
        return day;
    }
}
