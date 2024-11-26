package Lv3;

public class MenuItem {
    private String name;
    private double price;
    private String description;


    public MenuItem(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public String getMenuInfo(){
        String info1 = String.format("%-14s", getName());
        String info2 = "| W " + getPrice() + " | " + getDescription();
        return info1 + info2;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }
}
