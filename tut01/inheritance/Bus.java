package tut01.inheritance;

public class Bus extends Vehicle {
    private int[] routes;

    public Bus(String name, double width, double height, double length, double weight, int seatingCapacity, String registrationNumber, int[] routes) {
        super(name, width, height, length, weight, seatingCapacity, registrationNumber);
        if (weight < 5000.0 || weight > 20000.0)
            throw new IllegalArgumentException("Weight must be in the range [5000.0, 20000.0] kgs");

        if (length < 4.0 || length > 10.0)
            throw new IllegalArgumentException("Length must be in the range [4.0, 10.0] meters");

        if (registrationNumber.length() > 8)
            throw new IllegalArgumentException("Registration number for Bus can contain up to 8 alpha-numerical characters");

        this.routes = routes;
    }

    public int[] getRoutes() {
        return this.routes;
    }

    public void setRoutes(int[] routes) {
        this.routes = routes;
    }

    public void setWeight(double weight) {
        if (weight < 5000.0 || weight > 20000.0)
            throw new IllegalArgumentException("Weight must be in the range [5000.0, 20000.0] kgs");

        super.setWeight(weight);
    }

    public void setLength(double length) {
        if (length < 4.0 || length > 10.0)
            throw new IllegalArgumentException("Length must be in the range [4.0, 10.0] meters");

        super.setLength(length);
    }

    public void setRegistrationNumber(String registrationNumber) {
        if (registrationNumber.length() > 8)
            throw new IllegalArgumentException("Registration Number for Bus can contain up to 8 alpha-numerical characters");

        super.setRegistrationNumber(registrationNumber);
    }
}
