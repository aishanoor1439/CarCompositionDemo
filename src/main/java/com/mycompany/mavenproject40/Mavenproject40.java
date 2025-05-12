
package com.mycompany.mavenproject40;

public class Mavenproject40 {

    public static void main(String[] args) {
        Engine myEngine = new Engine(220, "V6");
        Door myDoor = new Door(4);
        Capacity myCapacity = new Capacity(5);
        Wheel myWheel = new Wheel(17);

        Car myCar = new Car(myEngine, myDoor, myCapacity, myWheel);

        myCar.displayCarInfo();

        myCar.engine.start();
        myCar.door.openDoors();
        myCar.capacity.showCapacity();
        myCar.wheel.rotate();
    }
}
