package tut01;

public class Car extends Vehicle {
    private String owner;

    public Car(String name, double width, double height, double length, double weight, int seatingCapacity,
            String registrationNumber, String owner) {
        super(name, width, height, length, weight, seatingCapacity, registrationNumber);
        if (weight < 1000.0 || weight > 2000.0) {
            throw new IllegalArgumentException("Weight must be in the range [1000.0, 2000.0] kgs");
        }
        if (length < 1.5 || length > 3.5) {
            throw new IllegalArgumentException("Length must be in the range [1.5, 3.5] meters");
        }
        if (registrationNumber.length() > 6) {
            throw new IllegalArgumentException(
                    "Registration Number for Car can contain up to 6 alpha-numerical characters");
        }
        this.owner = owner;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setWeight(double weight) {
        if (weight < 1000.0 || weight > 2000.0) {
            throw new IllegalArgumentException("Weight must be in the range [1000.0, 2000.0] kgs");
        }
        this.weight = weight;
    }

    public void setLength(double length) {
        if (length < 1.5 || length > 3.5) {
            throw new IllegalArgumentException("Length must be in the range [1.5, 3.5] meters");
        }
        this.length = length;
    }

    public void setRegistrationNumber(String registrationNumber) {
        if (registrationNumber.length() > 6) {
            throw new IllegalArgumentException(
                    "Registration Number for Car can contain up to 6 alpha-numerical characters");
        }
        this.registrationNumber = registrationNumber;
    }
}
