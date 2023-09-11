/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlinhanvien;

import java.util.Scanner;

/**
 *
 * @author anh
 */
public class NHANVIEN {

    private int id;
    private String name;
    private String date;
    private String sex;
    private String address;
    private double coefficientsSalary;
    private double salary;
    private String salaryCalculationMethod;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSalaryCalculationMethod() {
        return salaryCalculationMethod;
    }

    public void setSalaryCalculationMethod(String salaryCalculationMethod) {
        this.salaryCalculationMethod = salaryCalculationMethod;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getCoefficientsSalary() {
        return coefficientsSalary;
    }

    public void setCoefficientsSalary(double coefficientsSalary) {
        this.coefficientsSalary = coefficientsSalary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public NHANVIEN() {
        this.id = 0;
        this.name = null;
        this.date = null;
        this.sex = null;
        this.address = null;
        this.coefficientsSalary = 0;
        this.salary = 1050000;
        this.salaryCalculationMethod = null;
    }

    public NHANVIEN(int id, String name, String date, String sex, String address, int coefficientsSalary, double salary,String salaryCalculationMethod) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.sex = sex;
        this.address = address;
        this.coefficientsSalary = coefficientsSalary;
        this.salary = salary;
        this.salaryCalculationMethod = salaryCalculationMethod;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter id : ");
        this.id = Integer.parseInt(sc.nextLine());
        System.out.print("Enter name : ");
        this.name = sc.nextLine();
        System.out.print("Enter date of birth : ");
        this.date = sc.nextLine();
        System.out.print("Enter sex : ");
        this.sex = sc.nextLine();
        System.out.print("Enter address : ");
        this.address = sc.nextLine();
        System.out.print("Enter coefficients salary : ");
        this.coefficientsSalary = Double.parseDouble(sc.nextLine());
        System.out.print("Enter salary calculation method: ");
        this.salaryCalculationMethod = sc.nextLine();
    }

    public void output() {
        System.out.println("id : " + this.id);
        System.out.println("Name : " + this.name);
        System.out.println("Date of birth : " + this.date);
        System.out.println("Sex : " + this.sex);
        System.out.println("Address : " + this.address);
        System.out.println("Coefficents salary : " + this.coefficientsSalary);
        System.out.println("Salary = " + this.salary);
        System.out.println("Salary calculation method: " + this.salaryCalculationMethod);
        System.out.println();
    }

    public void calculateSalary() {
        setSalary(this.salary * this.coefficientsSalary);
    }

}
