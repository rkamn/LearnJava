/**
 * Following details of employees are available: Employee ID, Employee name and basic pay, allowances and deductions.
 * Write an object oriented program to calculate the gross pay and net pay. Create getter and setter methods for the above fields
 */

import java.util.Scanner;

public class Employee {
    private static int EmployeeId;
    private static String EmployeeName;
    private static float basicPay, allowances, deductions;


    public static void setter(){

        Scanner  s = new Scanner(System.in);

        System.out.println("Employee id: ");
        EmployeeId = s.nextInt();
        System.out.println("Employee name: ");
        EmployeeName = s.nextLine();
        System.out.println(EmployeeName);
        System.out.println("basic pay:");
        basicPay = s.nextFloat();
        System.out.println("allowances:");
        allowances = s.nextFloat();
        System.out.println("deductions:");
        deductions = s.nextFloat();
    }

    public static void main(String[] args){
        setter();
    }
}
