package u1pp;

public class Main 
{
	/**
	 * Main function, where the code starts running when you click "run"
	 */
    public static void main(String[] args) {
        
        // Use this space to test your code, or actually run your project
        System.out.println("\n\nHi! This is an empty project.\nYour code will start running from Main.java.\nIt may be daunting to start a project from scratch, but try to have fun with it! :)\n");

        
        printGreeting("Noah");
    }
    
    /*
     * returns the average of 3 integers. 
     * Should return a double that is mathematically accurate. 
     */
    public static double averageOfThree(double a, double b, double c) {
    	return (a + b + c) / 3.0;
    }
    
    /**
     * Prints a 1-line greeting based on the name given
     */
    public static void printGreeting(String name) {
    	System.out.print("Hello ");
    	System.out.print(name + " ");
    }
    
}
