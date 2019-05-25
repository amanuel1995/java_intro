/**
 * 
 */
package calling_methods;

/**
 * @author amanuel
 *
 */
public class calling_methods {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// call the methods in the calling_methods class
		
		greet(); // greet someone
		
		tell_birthday(); // tell them my birthday
		
	}
	
	public static void greet() {
		System.out.println("Hello from some function...");
		
		
	}
	
	public static int tell_birthday() {
		
		// return my birthday mddyyyy
		int birthday = 1301995;
		
		// greet again
		greet();
		System.out.println(birthday);
		
		return birthday;
	}
	

}
