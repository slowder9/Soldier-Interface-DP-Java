package com.company;

public class Marines extends Soldier implements Fight, Bomb {

    //Constructor (super) from Soldier class
    public Marines(String name, int rank, int serialNumber) {
        super(name, rank, serialNumber);
    }

    public String speak() {
        return "MARINES!";
    }

    @Override
    public String punch() {
        return "JAB!";
    }

    @Override
    public String dropBomb() {
        return "BOOOOM!";
    }
}
