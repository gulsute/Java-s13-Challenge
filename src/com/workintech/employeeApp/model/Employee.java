package com.workintech.employeeApp.model;

import java.util.Arrays;

public class Employee {
    private long id;
    private String fullName;
    private String email;
    private String password;
    private String[] healthPlans;

    public Employee () {

    };

    public Employee (long id, String fullName, String[] healthPlans) {
        this.id=id;
        this.fullName=fullName;
        this.healthPlans=healthPlans;
    }

    public long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", healthplans=" + Arrays.toString(healthPlans) +
                '}';
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String[] getHealthPlans() {
        return healthPlans;
    }

    public void setHealthPlans(String[] healthPlans) {
        this.healthPlans = healthPlans;
    }

    public void addHealthPlan(int index, String name) {
        try{
            boolean isExist = false;
            for(String healthPlan: healthPlans){
                if(healthPlan!= null && healthPlan.equals(name)){
                    isExist=true;
                    break;
                }
            }

            if(!isExist) {
                if (healthPlans[index] == null){
                    healthPlans[index] = name;
                } else {
                    System.out.println("İlgili index dolu.");
                }
            } else {
                System.out.println("Bu isimde healthplan mevcut.");
            }
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Invalid index number: " + index);
        }

    }
}
