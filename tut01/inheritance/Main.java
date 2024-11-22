package tut01.inheritance;

public class Main {
    public static void main(String[] args) {
        int[] busRoutes = {101, 102, 103};
        Bus bus = new Bus("CityBus", 2.5, 3.5, 8.0, 15000.0, 50, "BUS1234", busRoutes);
        System.out.println(bus);

        Car car = new Car("Sedan", 1.8, 1.4, 2.5, 1500.0, 4, "CAR12", "John Doe");
        System.out.println(car);

        IronSuit ironSuit = new IronSuit("Mark A", 1.2, 1.8, 1.0, 300.0, 1, "IRONMAN", 1500.0);
        System.out.println(ironSuit);
        ironSuit.fly("Ha Noi", "Da Nang", 765.0);
    }
}
