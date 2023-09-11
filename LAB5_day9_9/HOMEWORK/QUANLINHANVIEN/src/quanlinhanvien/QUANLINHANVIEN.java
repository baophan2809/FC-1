/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quanlinhanvien;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author anh
 */
public class QUANLINHANVIEN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        ArrayList<NHANVIEN> danhSachNhanVien = new ArrayList<>();
        do {
            mainMenu();
            System.out.print("Enter your choice : ");
            int choice = Integer.parseInt(sc.nextLine());
            if (choice == 4)
                break;
            switch(choice) {
                case 1: 
                NHANVIEN nv = new NHANVIEN();
                nv.input();
                danhSachNhanVien.add(nv);
                break;
                case 2:
                int i = 0;
                for (NHANVIEN nhanvien : danhSachNhanVien) {
                    i++;
                    System.out.println("Information of NHANVIEN no " + i);
                    nhanvien.output();
                }
                case 3:
                for (NHANVIEN employ : danhSachNhanVien)
                    employ.calculateSalary();
                System.out.println("Salary has been updated!");
                break;
            }
        } while (true);
    }

    public static void mainMenu() {
        System.out.println("1. Input information: ");
        System.out.println("2. Export information");
        System.out.println("3. Update salary");
        System.out.println("4. Exit");
    }

}
