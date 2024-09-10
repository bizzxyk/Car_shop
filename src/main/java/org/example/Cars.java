package org.example;

public class Cars {
    private String Name;
    private int cost;

    private String color;


    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Cars(String Name, int cost, String color){
        this.Name = Name;
        this.cost = cost;
        this.color = color;

    }




}
