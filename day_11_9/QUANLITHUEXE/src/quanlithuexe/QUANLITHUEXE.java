/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quanlithuexe;

import java.util.ArrayList;
import java.util.Scanner;

class phuongTien {

    private String nameRent;
    private int hourRent;

    public void setNameRent(String nameRent) {
        this.nameRent = nameRent;
    }

    public String getNameRent() {
        return nameRent;
    }

    public void setHourRent(int hourRent) {
        this.hourRent = hourRent;
    }

    public int getHourRent() {
        return hourRent;
    }

    public int getMoney() {
        return 0;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten nguoi thue: ");
        this.nameRent = sc.nextLine();
        System.out.println("Nhap so gio thue: ");
        this.hourRent = Integer.parseInt(sc.nextLine());
    }

    public void output() {
        System.out.println("Ten nguoi thue: " + this.nameRent);
        System.out.println("So gio thue: " + this.hourRent);
    }
}

class xeDap extends phuongTien {

    public int getMoney() {
        return 10000 + (getHourRent() - 1) * 8000;
    }

    public void input() {
        super.input();
    }

    public void output() {
        super.output();
        System.out.println("Loai xe: Xe dap");
        System.out.println("Tong tien thue: " + this.getMoney());
    }
}

class xeMay extends phuongTien {

    private int loaiXe;
    private String bienSo;

    @Override
    public int getMoney() {
        if (loaiXe == 100) {
            return 150000 + (getHourRent() - 1) * 100000;
        } else {
            return 200000 + (getHourRent() - 1) * 100000;
        }
    }

    public int getLoaiXe() {
        return loaiXe;
    }

    public void setLoaiXe(int loaiXe) {
        this.loaiXe = loaiXe;
    }

    public String getBienSo() {
        return bienSo;
    }

    public void setBienSo(String bienSo) {
        this.bienSo = bienSo;
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.print("Nhap loai xe: ");
        this.loaiXe = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap bien so: ");
        this.bienSo = sc.nextLine();
    }

    @Override
    public void output() {
        super.output();
        System.out.println("Loai xe: " + this.loaiXe + " phan khoi");
        System.out.println("Bien so xe: " + this.bienSo);
        System.out.println("Tong tien thue: " + getMoney());
    }
}

public class QUANLITHUEXE {

    private static ArrayList<phuongTien> vh = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            mainMenu();
            int choice;
            System.out.println("Lua chon cua ban: ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    int choose;
                    while (true) {
                        System.out.println("Ban muon nhap xe dap hay xe may");
                        System.out.println("1. Xe dap");
                        System.out.println("2. Xe may");
                        System.out.println("0. Thoat");
                        try {
                            choose = Integer.parseInt(sc.nextLine());
                            if (choose == 0) {
                                break;
                            } else if (choose == 1) {
                                phuongTien pt = new xeDap();
                                pt.input();
                                vh.add(pt);
                            } else if (choose == 2) {
                                phuongTien pt = new xeMay();
                                pt.input();
                                vh.add(pt);
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Ban da nhap sai, vui long nhap lai.");
                            continue;
                        }
                    }
                    break;
                case 2:
                    for (int i = 0; i < vh.size(); i++) {
                        vh.get(i).output();
                    }
                    break;
                case 3:
                    int chooseType;
                    System.out.println("Ban muon tinh tong loai xe nao");
                    System.out.println("1. Xe dap");
                    System.out.println("2. Xe may");
                    try {
                        chooseType = Integer.parseInt(sc.nextLine());
                        if (chooseType == 1) {
                            System.out.println("Tong tien cua xe dap: " + tinhTongXeDap());
                            break;
                        } else if (chooseType == 2) {
                            System.out.println("Tong tien cua xe may: " + tinhTongXeMay());
                            break;
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Ban da nhap sai, vui long nhap lai");
                        continue;
                    }
                    break;
                case 4:
                    System.out.println("Tong tien cua xe may 250 phan khoi: " + tinhTongXeMay250());
                    break;
                default:
                    System.out.println("Nhap sai, vui long nhap lai.");
                    break;
            }
        }
    }

    public static void mainMenu() {
        System.out.println("1. Nhap danh sach thue xe");
        System.out.println("2. Xuat danh sach thue xe");
        System.out.println("3. Tinh tong tien thue theo loai xe");
        System.out.println("4. Tinh tong tien thue xe may 250 phan khoi");
    }

    public static int tinhTongXeMay250() {
        int tong = 0;
        for (phuongTien pt : vh) {
            if (pt instanceof xeMay) {
                if (((xeMay) pt).getLoaiXe() == 250) {
                    tong += pt.getMoney();
                }
            }
        }
        return tong;
    }

    public static int tinhTongXeMay() {
        int tong = 0;
        for (phuongTien pt : vh) {
            if (pt instanceof xeMay) {
                tong += pt.getMoney();
            }
        }
        return tong;
    }

    public static int tinhTongXeDap() {
        int tong = 0;
        for (phuongTien pt : vh) {
            if (pt instanceof xeDap) {
                tong += pt.getMoney();
            }
        }
        return tong;
    }
}
