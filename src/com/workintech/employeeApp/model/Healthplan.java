package com.workintech.employeeApp.model;

import com.workintech.employeeApp.enums.Plan;

public class Healthplan {
    private long id;
    private String name;
    private Plan plan;

    public Healthplan (long id, String name, Plan plan) {
        this.id=id;
        this.name=name;
        this.plan=plan;
    }

    public Healthplan() {
    }

    public long getId () {
        return id;
    }

    public void setId (long id) {
        this.id=id;
    }

    public String getName() {
        return name;
    }

    public void setName (String name) {
        this.name=name;
    }

    public String getPlan() {
        return name;
    }

    public void setPlan (Plan plan) {
        this.plan=plan;
    }

    @Override
    public String toString() {
        return "Healthplan of " + name + " with id number: " + id + " is using plan " + plan.getName() ;
    }
}

