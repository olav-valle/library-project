/**
*The user interface of the book library application.
*@author Olav Valle
*@version 0.1 (25/09/2019)
*/

public class BookLibApp
{
    private static BookLibApp app;
    private static InputReader reader;
    public Library library;
    /** 
    * Constructor
    */
    public BookLibApp()
    {
	reader = new InputReader();
	library = new Library();


    }

    public static void main(String[] args)
    {
	app = new BookLibApp();

	app.init();
    }

    private void init()
    {
	boolean exit = false;
	
	fillLibrary();
	printWelcome();
	
	while(!exit) {

	int userInput = reader.getIntInput();
	    
	    if(userInput == 4){
		printFarewell();
		exit = true;
	    }
	    else if(userInput == 1) {
		
	    }
	    


	}
    }

    private void searchByTitle()
    {
	System.out.println("What is the title of the book you are searching for?");
	lib
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
    private void printWelcome()
    {
	System.out.println("Welcome to BookLibApp. What is your request?");
	System.out.println("1. Search the library");
	System.out.println("2. Add a book.");
	System.out.println("3. List all books.");
	System.out.println("4. Exit application.");
	System.out.println("Please type the number of the service you require.");
    }

    private void printFarewell()
    {
	System.out.println("Thank you. Goodbye.");
    }


    private void fillLibrary()
    {
        library.addBook("The Colour of Magic", "Terry Pratchett", "Corgi", "1985", "285", "9780552124751");
        library.addBook("The Light Fantastic", "Terry Pratchett", "Corgi", "1986", "241", "9780061020704");
        library.addBook("A first course in machine learning (Second edition)", "Simon Rogers, Mark Girolami", "CRC Press", "2017", "397","9781498738484");
        library.addBook("The Shadow of the Torturer", "Gene Wolfe", "Tom Doherty Associates, Inc.", "1982", "262", "9780671540661");
        library.addBook("Molecular Gastronomy: Exploring the science of Flavor", "Hervé This", "Columbia University Press", "2006", "377", "9780231133128");
        library.addBook("Les Halles Cookbook", "Anthony Bourdain", "Bloomsbury", "2004", "304", "9780747580126");
        library.addBook("Larousse Gastronomique", "Prosper Montagné", "Éditions Larousse", "1938", "1087", "9780600620426");
    }
    
}
