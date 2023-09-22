package employeeApp;

public enum Plan {
    NAME1(name1, 1000),
    NAME2(name2, 2000);

    private String name;
    private double price;

    Plan(String name, double price) {
        this.name = name;
        this.price = price;
    }
}
