package libraryCatalogue;

import java.util.HashMap;
import java.util.Map;

public class Driver {
    public static void main(String[] args) {
        Book book1 = new Book("Good Hymns", 11, 1234);
        Book book2 = new Book("Holy of Hollies", 12, 5678);
        Book book3 = new Book("Oldies", 50, 999999);

        Map<String, Book> coll = new HashMap<>();
        coll.put("Songs", book1);
        coll.put("Tape", book3);
        coll.put("Word", book2);

        LibraryCatalogue lib = new LibraryCatalogue(coll);
        lib.checkOut("Songs");
        //lib.getNextDay();
        //lib.getNextDay();
        lib.checkOut("Songs");
        lib.checkOut("Word");
        lib.checkOut("Tape");
        System.out.println(lib.getLengthCheckout());
        lib.setCurrentDay(20);
        System.out.println(lib.getLengthCheckout());
        lib.returnBook("Songs");



    }
}
