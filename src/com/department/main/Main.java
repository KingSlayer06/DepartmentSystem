package com.department.main;

import com.department.model.AdminDepartment;
import com.department.model.HrDepartment;
import com.department.model.TechDepartment;

public class Main {
    static AdminDepartment adminDepartment = new AdminDepartment();
    static HrDepartment hrDepartment = new HrDepartment();
    static TechDepartment techDepartment = new TechDepartment();

    public static void main(String[] args) {

        // Admin Department
        System.out.println("Welcome to " + adminDepartment.departmentName());
        System.out.println(adminDepartment.getTodaysWork());
        System.out.println(adminDepartment.getWorkDeadline());
        System.out.println(adminDepartment.isTodayAHoliday());
        System.out.println();

        // Hr Department
        System.out.println("Welcome to " + hrDepartment.departmentName());
        System.out.println(hrDepartment.doActivity());
        System.out.println(hrDepartment.getTodaysWork());
        System.out.println(hrDepartment.getWorkDeadline());
        System.out.println(hrDepartment.isTodayAHoliday());
        System.out.println();

        // Tech Department
        System.out.println("Welcome to " + techDepartment.departmentName());
        System.out.println(techDepartment.getTodaysWork());
        System.out.println(techDepartment.getWorkDeadline());
        System.out.println(techDepartment.getTechStackInformation());
        System.out.println(techDepartment.isTodayAHoliday());
        System.out.println();
    }
}
