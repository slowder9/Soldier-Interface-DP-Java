package com.company;

public class Navy extends Soldier implements Fight, Bomb {

    //Constructor (super) from Soldier Class
    public Navy(String name, int rank, int serialNumber) {
        super(name, rank, serialNumber);
    }

    public String speak() {
        return "NAVY all the way!";
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
