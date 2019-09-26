
import java.util.Iterator;
import java.util.ArrayList;
import javax.swing.*;

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

    public void listAllBooksIterator()
    {
	Iterator<Book> it = this.library.iterator();
	while(it.hasNext())
	{
	    (it.next()).printDetails();
	    // retrieve next book object disdasdrectly from iterator
	    // and call .printDetails on it
	}
    }
    
     //TODO: expand search function so it matches keyword to any string field in Book object
     // option 1: return all fields from Book object as single string, and call .contains(keyword) on that string. Crude but easy(?).
     // option 2: call each acccessor from Book object, check .contains(keword) on each, and set local variable boolean match; to true/false. Requires A LOT of conditionals, or one stupidly long conditinal with lots of ||.
     
     /**
     * Calls a string from Book object, which contains all fields concatenated to one string.
     * Performs a .contains() call on this string, and prints details of book if ANY match is found.
     * If it's stupid, and it works, then it's not stupid.
     */
     
     public void searchByKeywordWithUI()
     {
        String keyword = JOptionPane.showInputDialog
                            ("Search by either  book title, author name (capitalised), ISBN or publisher.");
        for (Book foundBook : library) {
            String allFields = foundBook.getFieldsAsString();
            if (allFields.contains(keyword)) {
                System.out.println("###### MATCH FOUND ######");
                foundBook.printDetails();
            }       
        }   
     }
     
     
/**
* Variant of searchByKeyword with GUI elements
* Uses javax.swing and JOptionPane for user input and result return
*/          
     public void searchByKeyword()
     {
        String keyword = JOptionPane.showInputDialog
                        ("Enter search");
        for (Book foundBook : library) {
            String allFields = foundBook.getFieldsAsString();
            if (allFields.contains(keyword)) {
                JOptionPane.showMessageDialog(null,
                foundBook.getName(),
                "MATCH FOUND",
                JOptionPane.INFORMATION_MESSAGE);
            }       
        }   
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

