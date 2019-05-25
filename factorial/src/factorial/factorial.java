/**
 * 
 */
package factorial;

/**
 * @author amanuel
 *
 */
public class factorial {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final int NUMS = 12;
		for(int i = 0; i < NUMS; i++)
			System.out.println( i + "! is " + compute_factorial(i));
	}
	
	/**
	 * 
	 * @param n the number for which we want the factorial
	 * @return
	 */
	public static int compute_factorial(int n) {
		int factorial_val = 1;
		
		// case 1
		if (n == 0) {
			factorial_val = 1;
		}
		
		else {
			for (int i=1; i<=n; i++) {
				factorial_val *= i;
			}
		}
		
		return factorial_val;
	}

}
