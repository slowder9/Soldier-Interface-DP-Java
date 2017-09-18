package com.company;

public class Army extends Soldier implements Fight, Bomb {

    //Constructor (super) from Soldier class
    public Army(String name, int rank, int serialNumber) {
        super(name, rank, serialNumber);
    }

    //Abstract method - different return Strings for Army, Navy, Marines
    public String speak() {
        return "We are the ARMY!";
    }

    //Call method "punch" from Fight interface
    @Override
    public String punch() {
        return "JAB!";
    }

    //Call method "dropBomb" from Bomb interface
    @Override
    public String dropBomb() {
        return "BOOOOM!";
    }
}
