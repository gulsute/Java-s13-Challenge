package com.workintech.employeeApp.enums;

public enum Plan {
    BASIC("basic", 1000),
    MEDIUM("medium", 3000),
    ADVANCE("advance", 8000);


    private String name;
    private int price;

    Plan(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
