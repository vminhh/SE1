package tut01.inheritance;

public class IronSuit extends Vehicle {
    private double maxFlightSpeed;

    public IronSuit(String name, double width, double height, double length, double weight, int seatingCapacity, String registrationNumber, double maxFlightSpeed) {
        super(name, width, height, length, weight, seatingCapacity, registrationNumber);
        this.maxFlightSpeed = maxFlightSpeed;
    }

    public void fly(String pointA, String pointB, double distance) {
        System.out.println("Flying from " + pointA + " to " + pointB + ", Distance: " + distance + " km");

        System.out.print(pointA + " ");
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(500);
                System.out.print(".");
            } catch (InterruptedException _) {
            }
        }
        System.out.println(" " + pointB);
    }

    public double getMaxFlightSpeed() {
        return this.maxFlightSpeed;
    }

    public void setMaxFlightSpeed(double maxFlightSpeed) {
        this.maxFlightSpeed = maxFlightSpeed;
    }

    @Override
    public String toString() {
        return super.toString() + ", Max Flight Speed: " + maxFlightSpeed + " km/h";
    }
}
