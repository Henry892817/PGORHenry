import java.util.ArrayList;
class ReservationSystem {
    private ArrayList<Event> events = new ArrayList<>();
    private ArrayList<Customer> customers = new ArrayList<>();


    public void addEvent(Event event) { events.add(event); }
    public void addCustomer(Customer customer) { customers.add(customer); }

    public void makeReservation(Customer customer, Event event) {
        if (event.getAvailableSeats() > 0) {
            customer.addReservation(event);
            event.reserveSeat();
        } else {
            System.out.println("No seats available for " + event.getName());
        }
    }

    public Event findEvent(String name) {
        for (Event event : events) {
            if (event.getName().equals(name)) return event;

        }
        return null;
    }

    public Customer findCustomer(String lastName) {
        for (Customer customer : customers) {
            if (customer.getLastName().equals(lastName)) return customer;
        }
        return null;
    }

    public void changeEventPrice(String name, double newPrice) {
        Event event = findEvent(name);
        if (event != null) event.setPrice(newPrice);
    }
}
