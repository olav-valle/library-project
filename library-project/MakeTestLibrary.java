
/**
 * Write a description of class MakeLibrary here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MakeTestLibrary
{
    // instance variables - replace the example below with your own
    public StringLibrary testLib;

    /**
     * Constructor for objects of class MakeLibrary
     */
    public MakeTestLibrary()
    {
        // initialise instance variables
        testLib = new StringLibrary();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void addBooks()
    {
        testLib.addBook("Night Watch");
        testLib.addBook("Colour of Magic");
        testLib.addBook("The Light Fantastic");
        testLib.addBook("Reaper Man");
        testLib.addBook("Sourcery");
    }
}
