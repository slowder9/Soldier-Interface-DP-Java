package com.company;

public class Main {

    public static void main(String[] args) {

        //Can't use jerkFace.punch here because "Soldier" class does not have the punch method...Army, Navy, Marines do however
        Soldier jerkFace = new Army("jerkFace", 100, 9);
//        System.out.println(jerkFace.punch() + " " + jerkFace.speak());
        System.out.println(jerkFace.eat());
        System.out.println(jerkFace.sleep());
        System.out.println(jerkFace.walk());

        //Here I can use the punch method because Navy has that method
        Navy steve = new Navy("Steve", 5, 123);
        System.out.println(steve.punch() + " " + steve.dropBomb());
        System.out.println(steve.speak());
    }
}
