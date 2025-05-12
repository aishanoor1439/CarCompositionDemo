
package com.mycompany.mavenproject40;

public class Engine {
    public int horsepower;
    public String type;

    public Engine(int horsepower, String type) {
        this.horsepower = horsepower;
        this.type = type;
    }

    public void start() {
        System.out.println("Engine started. Horsepower: " + horsepower + ", Type: " + type);
    }
}
