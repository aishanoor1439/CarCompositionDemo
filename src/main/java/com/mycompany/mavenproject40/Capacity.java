
package com.mycompany.mavenproject40;

public class Capacity {
    public int seats;

    public Capacity(int seats) {
        this.seats = seats;
    }

    public void showCapacity() {
        System.out.println("This car has a seating capacity of " + seats + " persons.");
    }
}
