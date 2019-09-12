
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
        // initialise library as ArrayList object of type Book asdasd
        library = new ArrayList<Book>();
        makeLibrary();
    }
    
    /**
     * Generates a collection of books and adds them to the library
     */
    public void makeLibrary()
    {
        addBook("The Colour of Magic", "Terry Pratchett", "Corgi", "1985", 
                "285", "9780552124751");
        addBook("The Light Fantastic", "Terry Pratchett", "Corgi", "1986", 
                "241", "9780061020704");
        addBook("A first course in machine learning (Second edition)", 
                "Simon Rogers, Mark Girolami", "CRC Press", "2017", "397",
                 "9781498738484");
        addBook("The Shadow of the Torturer", "Gene Wolfe", 
                "Tom Doherty Associates, Inc.", "1982", "262", 
                "9780671540661");
        addBook("Molecular Gastronomy: Exploring the science of Flavor", 
                "Hervé This", "Columbia University Press", "2006", "377", 
                "9780231133128");
        addBook("Les Halles Cookbook", "Anthony Bourdain", "Bloomsbury", 
                "2004", "304", "9780747580126");
        addBook("Larousse Gastronomique", "Prosper Montagné", 
                "Éditions Larousse", "1938", "1087", "9780600620426");
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
    
   /**
    * Calls the printDetails method for each Book object in library.
    *
    * Formatting of printed message is handled by Book object, 
    * see printDetails method in Book class.
    * 
    * For readablility, a separator containing the index number is added 
    * between each object
    */
    
    public void listAllBooks()
    {
        int index = 0; // counter for index number 
        for (Book book : library) {
            System.out.println("###### INDEX ITEM " + index + " ######");
            book.printDetails();
            index++; // increment index position
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

