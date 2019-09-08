
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
    // only field is the ArrayList 
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
     * Generates a collection of books and adds them to the library
     */
    public void makeLibrary()
    {
        addBook("The Colour of Magic", "Terry Pratchett", "Corgi", 1985, 285, "9780552124751");
        addBook("A first course in machine learning (Second edition)", "Simon Rogers, Mark Girolami", "CRC Press", 2017, 397, "9781498738484");
        addBook("The Shadow of the Torturer", "Gene Wolfe", "Tom Doherty Associates, Inc.", 1982, 262, "9780671540661");
        addBook("Molecular Gastronomy: Exploring the science of Flavor", "Hervé This", "Columbia University Press", 2006, 377, "9780231133128");
        addBook("Les Halles Cookbook", "Anthony Bourdain", "Bloomsbury", 2004, 304, "9780747580126");
        addBook("Larousse Gastronomique", "Prosper Montagné", "Éditions Larousse", 1938, 1087, "9780600620426");
    }
    
    /**
     * Creates new Book instance from the parameters given, 
     * and adds the new book to library ArrayList.
     */
    public void addBook(String bookTitle, String bookAuthor, String bookPublisher,
                        int publishingDate, int bookPages, String ean13)
    {
        Book newBook = new Book(bookTitle, bookAuthor, bookPublisher, publishingDate, 
                                bookPages, ean13);
        library.add(newBook);
    }
    
    /**
     * Calls the printDetails method for each Book object in library.
     *
     * Formatting of printed message is handled by Book object, 
     * see printDetails method in Book class.
     * 
     * For readablility, a separator containing the index number is added between each object
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
    
    /**
     * Search function that prints details of matched hits.
     */
    public void search(String keyword)
    {
        
    }
}
