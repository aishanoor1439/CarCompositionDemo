
package com.mycompany.mavenproject40;

public class Door {
    public int numberOfDoors;

    public Door(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public void openDoors() {
        System.out.println("All " + numberOfDoors + " doors are opened.");
    }
}
