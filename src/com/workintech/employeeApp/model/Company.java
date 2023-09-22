package com.workintech.employeeApp.model;

import java.util.Arrays;

public class Company {

    private long id;
    private String name;
    private double giro;
    private String[] developerNames;


    public Company (long id, String name) {
        this.id=id;
        this.name=name;
    }

    public Company(long id, String name, double giro, String[] developerNames) {
        this.id = id;
        this.name = name;
        this.giro = giro;
        this.developerNames = developerNames;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGiro() {
        return giro;
    }

    public void setGiro(double giro) {
        checkGiro(giro);
    }

    public String[] getDeveloperNames() {
        return developerNames;
    }

    public void setDeveloperNames(String[] developerNames) {
        this.developerNames = developerNames;
    }

    private void checkGiro (double giro) {
        if (giro<0) {
            this.giro=0;
        } else {
            this.giro=giro;
        }
    }

    public void addEmployee (int index, String name) {
        try {
            if (developerNames [index] == null) {
                developerNames[index] = name;
            } else {
                System.out.println("İlgili index için developer mevcut.");
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Olmayan index için atama yapıldı: " + index);
        }
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", giro=" + giro +
                ", developerNames=" + Arrays.toString(developerNames) +
                '}';
    }
}
