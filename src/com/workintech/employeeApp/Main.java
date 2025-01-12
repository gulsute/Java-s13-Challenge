package com.workintech.employeeApp;


import com.workintech.employeeApp.enums.Plan;
import com.workintech.employeeApp.model.Company;
import com.workintech.employeeApp.model.Employee;
import com.workintech.employeeApp.model.Healthplan;

import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Healthplan plan1 = new Healthplan(1, "A Sigorta", Plan.ADVANCE);
        Healthplan plan2 = new Healthplan(2, "D Sigorta", Plan.BASIC);

        System.out.println(plan1);
        System.out.println(plan2);

        String[] healthPlans = new String[3];
        healthPlans[0] = plan1.getName();
        healthPlans[1] = plan2.getName();

        Employee employee = new Employee(11, "Ali Veli", healthPlans);

        employee.getHealthPlans();
        employee.addHealthPlan(0, "C Sigorta");
        employee.addHealthPlan(2, "A Sigorta");
        employee.addHealthPlan(2, "Z Sigorta");
        employee.addHealthPlan(5, "K Sigorta");

        System.out.println(Arrays.toString(employee.getHealthPlans()));

        Employee developer = new Employee(3, "Gulsu", healthPlans);
        String[] developerNames = new String[5];
        developerNames[0] = developer.getFullName();

        System.out.println("**************");
        Company company = new Company(1, "Workintech", 100000000, developerNames);
        company.addEmployee(0, "Anıl");
        company.addEmployee(5, "Anıl");
        company.addEmployee(1, "Anıl");

        System.out.println(company);

    }
}
