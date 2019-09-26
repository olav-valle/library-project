
import java.util.Iterator;
import java.util.ArrayList;

/**
 * A library class that creates and manages an ArrayList of Book objects.
 * 
 * Books can be added, and a list of books in library can be printed.
 * 
 * @author Olav Valle   
 * @version 20190908
 */
public class Library
{
    // only field is the ArrayList holding the books
    private ArrayList<Book> library;
    
    /**
     * Constructor for objects of class Library
     */
    public Library()
    {
        // initialise library as ArrayList object of type Book 
        library = new ArrayList<Book>();
    }
    
    /**
     * Add an existing book object to list
     */
    public void addBook(Book existingBook)
    {
        this.library.add(existingBook);
    }
    
    /**
     * Creates new Book instance, using the parameters given, by calling 
     * Book constructor, and adds the new book to library using addBook method.
     */
    
    public void addBook(String bookTitle, String bookAuthor, 
                        String bookPublisher,String publishingDate, 
                        String bookPages, String ean13)
    {
        Book newBook = new Book(bookTitle, bookAuthor, bookPublisher, 
                                publishingDate, bookPages, ean13);
        addBook(newBook);
    }
    public ArrayList<Book> getCollection()
    {
	return library;
    }
     
    /**
     * Search function that prints details of matched hits.
     * Uses for-loop, and checks every object in collection.
     */
     
    // TODO: change to while-loop, and only show e.g. first five hits?
    // while(matches < 5) etc. etc..
    
    public void searchByTitle(String keyword)
    {
        for (Book foundBook : library) {
            String title = foundBook.getTitle();
            if (title.contains(keyword)) {
                foundBook.printDetails();
            }
        }
    }
}

