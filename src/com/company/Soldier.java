package com.company;

public abstract class Soldier {
    //Instance variables
    protected String name;
    protected int rank;
    protected int serialNumber;

    //Soldier Constructor
    public Soldier(String name, int rank, int serialNumber) {
        this.name = name;
        this.rank = rank;
        this.serialNumber = serialNumber;
    }

    //Non-abstract methods
    public String sleep() {
        return "Snore";
    }

    public String eat() {
        return "Chew";
    }

    public String walk() {
        return "Trudge";
    }

    //Abstract method
    public abstract String speak();
}
