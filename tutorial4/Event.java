public class Event {

        private String name;
        private String date;
        private String location;
        private int maxNumberOfSeats = 50;
        private int availableSeats = 3;
        private double price;

        public Event(String name, double price) {
            this.name = name;
            this.price = price;
        }

        public Event(String name, double price, String date) {
            this(name, price);
            this.date = date;
        }

        public Event(String name, double price,

                     String date, String location) {
            this(name, price, date);
            this.location = location;
        }

        public String getName() { return name; }
        public double getPrice() { return price; }
        public void setPrice(double price) { this.price = price; }
        public int getAvailableSeats() { return availableSeats; }
        public int getMaxNumberOfSeats() { return maxNumberOfSeats; }
        public void reserveSeat() { if (availableSeats > 0) availableSeats--; }

        @Override
        public String toString() {
            return name + " at " + location + " on " + date + " ($" + price + ")";
        }

    }


