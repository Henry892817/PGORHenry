public class LibraryTest {
    public static void main(String[] args) {
        Book book1 = new Book("FAKE", 1970,   "HENRY LEE", 450);
        Book book2 = new Book("BIRTH", 2029, "HENRY LEE", 300);

        Movie movie1 = new Movie("ICYARO", 2002, "INGENZI LEWIS", 189);
        Movie movie2 = new Movie("NTAMIKINO", 2025, "INGENZI LEWIS", 810);


        LibraryMedia[] mediaArray = new LibraryMedia[4];
        mediaArray[0] = book1;
        mediaArray[1] = book2;
        mediaArray[2] = movie1;
        mediaArray[3] = movie2;

        System.out.println("===== INFORMATION ABOUT ALL MEDIA =====");
        for (LibraryMedia media : mediaArray) {
            media.displayInformation();
            System.out.println("--------------------");
        }

        System.out.println("\n===== BORROWING AND RETURNING OPERATIONS =====");
        book1.borrow();
        book1.borrow();

        book1.returnMedia();

        System.out.println("\n===== TYPE-SPECIFIC METHODS =====");
        book2.checkNumberOfPages();
        movie1.checkDuration();

        System.out.println("\n===== TYPE CASTING =====");
        for (LibraryMedia media : mediaArray) {
            if (media instanceof Book) {
                ((Book) media).checkNumberOfPages();
            } else if (media instanceof Movie) {
                ((Movie) media).checkDuration();
            }
        }
    }
}
