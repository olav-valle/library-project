import java.util.ArrayList;
/**
 * Write a description of class StringLibrary here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StringLibrary
{
    // instance variables - replace the example below with your own
    private ArrayList<String> stringLibrary;

    /**
     * Constructor for objects of class StringLibrary
     */
    public StringLibrary()
    {
        // initialise instance variables
        stringLibrary = new ArrayList<String>();
    }

    public void addBook(String name)
    {
        String newBook = new String(name);
        stringLibrary.add(newBook);
    }

    public void listAllBooks()
    {
        int index = 0;
        for (String listThis : stringLibrary) {
            System.out.println(index + ":" + listThis);
            index++;
        }
    }

    public void listMatching(String searchWord)
    {
        String searchTerm = searchWord;
        boolean matchFound = false;

        for (String listThis : stringLibrary) {
            if (listThis.contains(searchWord) ){
                System.out.println(listThis);
                matchFound = true;
            }
        }
        
        if (matchFound == false) {
            System.out.println("No match found for search term \"" + 
                searchTerm + "\"");
        }
    }
}
