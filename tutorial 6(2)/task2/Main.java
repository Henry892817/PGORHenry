public class Main {
    public static void main(String[] args) {
        vehicle.Car car = new vehicle.Car(5);
        car.start();
        car.stop();
        System.out.println("Number of seats: " + car.getNumberOfSeats());
    }
}