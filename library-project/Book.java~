/**
 * A class that maintains information on a book.
 *
 * @author Olav Valle
 * @version 2019.09.08
 */
public class Book
{
    private String title;
    private String authorName;
    private String publisher;
    private String date;
    private String pages;
    // using String for EAN-13 for now. 
    // possible to change to Long, for arithmetic 
    // TODO: find and implement an EAN-13 generator class?
    private String ean13;  
    private boolean borrowed;

    /**
     * User inputs relevant information. 
     * Borrowed status initialises to false, since book has not been 
     * available until now.
     * 
     * Class does not contain methods for changing String fields 
     * after initialisation
     * 
     * 
     * Warning: EAN-13 String does not demand 13 characters, and is only 
     * placeholder for functional IAN/EAN-13 encoding. 
     */
    public Book(String bookTitle, String bookAuthor, 
                String bookPublisher, String publishingDate, 
                String bookPages, String ean13)
    {
        this.title = bookTitle;
        this.authorName = bookAuthor;
        this.publisher = bookPublisher;
        this.date = publishingDate;
        this.pages = bookPages;        
        this.ean13 = ean13;
        this.borrowed = false;
    }

    // TODO: Add mutators for other fields, 
    // e.g. in case original entry was misspelled?

// -------------------- mutators --------------------

    /**
     * Set borrowed status as boolean value.
     * Called when book is checked out from, or returned to library.
     * @param  status   boolean of "the book is currently being borrowed."
     */
    public void setBorrow(boolean status)
    {
        this.borrowed = status;
    }

// -------------------- accessors --------------------

    public String getTitle() { return this.title; }

    public String getName() { return this.authorName; }

    public String getPublisher() { return this.publisher; }

    public String getDate() { return this.date; }

    public String getPages() { return this.pages; }

    public String getRefNumber() { return this.ean13; }

    public boolean getBorrowed() { return this.borrowed; }
    
    // returns a human readable string with borrowed status
    public String getBorrowedAsString()
    {
        String borrowedString;

        if (borrowed) {
            borrowedString = "This book is currently on loan.";
        }
        else {
            borrowedString = "This book is available for loan";
        }
        return borrowedString;
    }
    
    /** 
    * A very crude way of allowing String method contains() to be used as 
    * search function on ALL fields at once. 
    * Concatenates all object String fields into single String, and returns.
    *
    * I am so sorry. Please forgive me.
    */
    public String getFieldsAsString()
    {
        String allFields = (title + authorName + publisher + date + pages + ean13);
        return allFields.toUpperCase();
    }

// -------------------- print methods --------------------
    /**
     * Print the details from all fields to terminal.
     * Call this method from Library object when listing book details
     */
    public void printDetails()
    {
        System.out.println("Book title: " + title);
        System.out.println("Author: " + authorName);
        System.out.println("Publisher: " + publisher);
        System.out.println("Date published: " + date);
        System.out.println("Numer of pages: " + pages);
        System.out.println(getBorrowedAsString());
        System.out.println("EAN-13 reference: " + ean13);
        System.out.println();
    }


    /**
     * Prints name of author to terminal.
     */
    public void printAuthor()
    {
        System.out.println(authorName);
    }

    /**
     * Prints title of book to terminal.
     */
    public void printTitle()
    {
        System.out.println(title);
    }
}
