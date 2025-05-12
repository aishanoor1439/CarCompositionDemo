
package com.mycompany.mavenproject40;

public class Car {
    public Engine engine;
    public Door door;
    public Capacity capacity;
    public Wheel wheel;

    public Car(Engine engine, Door door, Capacity capacity, Wheel wheel) {
        this.engine = engine;
        this.door = door;
        this.capacity = capacity;
        this.wheel = wheel;
    }

    public void displayCarInfo() {
        System.out.println("Displaying car components:");
        engine.start();
        door.openDoors();
        capacity.showCapacity();
        wheel.rotate();
    }
}
