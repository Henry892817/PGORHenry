
    import java.util.ArrayList;
    class Customer {
        private String firstName;
        private String lastName;
        private String email;
        private ArrayList<Event> reservationList = new ArrayList<>();

        public Customer(String firstName, String lastName, String email) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.email = email;
        }

        public String getFirstName() { return firstName; }
        public String getLastName() { return

                lastName; }

        public void addReservation(Event event) { reservationList.add(event); }
        public void cancelReservation(Event event) { reservationList.remove(event); }

        public void displayReservations() {
            for (Event event : reservationList) {
                System.out.println(event);
            }
        }
    }


