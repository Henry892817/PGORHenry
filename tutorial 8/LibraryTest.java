
import java.util.ArrayList;
import java.util.List;


interface MediaItem {
    String LIBRARY_NAME = "Digital Commons Library";

    String getTitle();
    int getYear();
    String getDisplayString();
}


interface Rentable {
    int MAX_RENTAL_DAYS = 14;

    static double calculateLateFee(int daysLate) {
        return daysLate * 0.50;
    }


    boolean isAvailable();
    boolean rent();
    void returnItem();
}

interface Rateable {
    void addRating(int rating); // 1-5 stars
    double getAverageRating();
}

class Book implements MediaItem, Rentable {
    private String title;
    private String author;
    private int year;
    private String isbn;
    private boolean available;

    public Book(String title, String author, int year, String isbn) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.isbn = isbn;
        this.available = true;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public int getYear() {
        return year;
    }

    @Override
    public String getDisplayString() {

        return "Book: " + title + " by " + author + " (" + year + ") - ISBN: " + isbn;
    }

    @Override
    public boolean isAvailable() {
        return available;
    }

    @Override
    public boolean rent() {
        if (available) {
            available = false;
            return true;
        }
        return false;
    }

    @Override
    public void returnItem() {
        available = true;

    }
}

class Movie implements MediaItem, Rentable, Rateable {
    private String title;
    private String director;
    private int year;
    private int duration;
    private boolean available;
    private List<Integer> ratings;

    public Movie(String title, String director, int year, int duration) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.duration = duration;
        this.available = true;
        this.ratings = new ArrayList<>();

    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public int getYear() {
        return year;
    }

    @Override
    public String getDisplayString() {
        return "Movie: " + title + " directed by " + director + " (" + year + ") - Duration: " + duration + " minutes";
    }

    @Override
    public boolean isAvailable() {

        return available;
    }

    @Override
    public boolean rent() {
        if (available) {
            available = false;
            return true;
        }
        return false;
    }

    @Override
    public void returnItem() {
        available = true;
    }

    @Override
    public void addRating(int rating) {
        if (rating >= 1 && rating <= 5) {
            ratings.add(rating);

        }
    }

    @Override
    public double getAverageRating() {
        if (ratings.isEmpty()) return 0.0;
        int sum = 0;
        for (int r : ratings) {
            sum += r;
        }
        return (double) sum / ratings.size();
    }
}

public class LibraryTest {
    public static void main(String[] args) {
        System.out.println("Welcome to " + MediaItem.LIBRARY_NAME);
        System.out.println("Maximum rental period: " + Rentable.MAX_RENTAL_DAYS + " days\n");
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925, "978-0-7432-7356-5");
        System.out.println(book1.getDisplayString());
        System.out.println("Available: " + book1.isAvailable());

        if (book1.rent()) {
            System.out.println("Book rented successfully!");
        }
        System.out.println("Available after rental: " + book1.isAvailable());

        System.out.println("Late fee for 3 days: $" + Rentable.calculateLateFee(3));

        book1.returnItem();
        System.out.println("Available after return: " + book1.isAvailable() + "\n");

        Movie movie1 = new Movie("Inception", "Christopher Nolan", 2010, 148);
        System.out.println(movie1.getDisplayString());

        movie1.addRating(5);
        movie1.addRating(4);
        movie1.addRating(5);

        System.out.println("Average rating: " + movie1.getAverageRating() + " stars");

        if (movie1.rent()) {
            System.out.println("Movie rented successfully!");
        }

        if (!movie1.rent()) {
            System.out.println("Movie is already rented!");
        }
    }
}
