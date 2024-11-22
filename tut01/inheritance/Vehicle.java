package tut01.inheritance;

public class Vehicle {
    private String name;
    private double width, height, length, weight;
    private int seatingCapacity;
    private String registrationNumber;

    public Vehicle(String name, double width, double height, double length, double weight, int seatingCapacity, String registrationNumber) {
        this.name = name;
        this.width = width;
        this.height = height;
        this.length = length;
        this.weight = weight;
        this.seatingCapacity = seatingCapacity;
        this.registrationNumber = registrationNumber;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getLength() {
        return this.length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getSeatingCapacity() {
        return this.seatingCapacity;
    }

    public void setSeatingCapacity(int seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }

    public String getRegistrationNumber() {
        return this.registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    @Override
    public String toString() {
        return "Class: " + this.getClass().getSimpleName() + ", Name: " + this.name + ", Width: " + this.width + ", Height: " + this.height + ", Length: " + this.length + ", Weight: " + this.weight + ", Seating Capacity: " + this.seatingCapacity + ", Registration Number: " + this.registrationNumber;
    }
}
