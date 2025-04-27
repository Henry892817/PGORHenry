public class vehicle{
    class Vehicle {
        public void start() {
            System.out.println("Vehicle is starting.");
        }

        public void stop() {
            System.out.println("Vehicle is stopping.");
        }
    }

    static class Car {
        private int numberOfSeats;

        public Car(int numberOfSeats) {
            this.numberOfSeats = numberOfSeats;
        }

        public int getNumberOfSeats() {
            return numberOfSeats;
        }


        public void start() {
            System.out.println("Car engine is starting with a roar.");
        }


        public void stop() {
            System.out.println("Car engine is shutting down smoothly.");
        }
    }


}
