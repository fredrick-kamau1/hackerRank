package libraryCatalogue;

import java.util.HashMap;
import java.util.Map;

public class LibraryCatalogue {

    Map<String, Book> bookCollection = new HashMap<>();
    int currentDay = 0;
    int nextDay = 0;

    int lengthCheckout = 7;
    double initialLateFee = 0.50;
    double feePerLateDay = 1.00;

    public LibraryCatalogue(Map<String, Book> bookCollection) {
        this.bookCollection = bookCollection;
    }

    public LibraryCatalogue(Map<String, Book> bookCollection, int lengthCheckout, double initialLateFee, double feePerLateDay) {
        this.bookCollection = bookCollection;
        this.lengthCheckout = lengthCheckout;
        this.initialLateFee = initialLateFee;
        this.feePerLateDay = feePerLateDay;
    }

    public int getNextDay() {
        return currentDay++;
    }

    public void setDay(int day){
        this.currentDay = day;
    }
    public Map<String, Book> getBookCollection() {
        return bookCollection;
    }

    public void setBookCollection(Map<String, Book> bookCollection) {
        this.bookCollection = bookCollection;
    }

    public int getCurrentDay() {
        return currentDay;
    }

    public void setCurrentDay(int currentDay) {
        this.currentDay = currentDay;
    }

    public int getLengthCheckout() {
        return lengthCheckout;
    }

    public void setLengthCheckout(int lengthCheckout) {
        this.lengthCheckout = lengthCheckout;
    }

    public double getInitialLateFee() {
        return initialLateFee;
    }

    public void setInitialLateFee(double initialLateFee) {
        this.initialLateFee = initialLateFee;
    }

    public double getFeePerLateDay() {
        return feePerLateDay;
    }

    public void setFeePerLateDay(double feePerLateDay) {
        this.feePerLateDay = feePerLateDay;
    }

    public Book getBook(String bookTitle){
        return getBookCollection().get(bookTitle);
    }

    //Instance methods
    public void checkOut(String title){
        Book book = getBook(title);
        if(book.isCheckedOut()){
            sorryBookAlreadyCheckedOut(book);
        }else{
            book.setCheckedOut(true,getCurrentDay());
            System.out.println("You just checked out " + book.getTitle() + ". It it due on " + (getCurrentDay() + getLengthCheckout()) + ".");
        }
    }

    public void returnBook(String title){
        Book book = getBook(title);
        int daysLate = currentDay - (book.getDayCheckedOut() + getLengthCheckout());
        if(daysLate > 0){
            System.out.println("You owe the library $ " + (getInitialLateFee() + daysLate * getFeePerLateDay()) + " because your book is  "
            + daysLate + " days overdue");
        }else{
            System.out.println("Book returned. Thank you");
        }
        book.setCheckedOut(false, -1);
    }

    public void sorryBookAlreadyCheckedOut(Book book){
        System.out.println("Sorry, " + book.getTitle() + " is already checked out. It should be back on " + (book.getDayCheckedOut() + getLengthCheckout() + "."));
    }

    //TODO Add reserve function

    //TODO Create a UI to grab this info

    //TODO total books checked out
}
