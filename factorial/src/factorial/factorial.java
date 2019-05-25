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
		System.out.println("Finding the factorial of 0...");

		int return_val = compute_factorial(0);
		
		System.out.print(return_val);
		System.out.printf("%n");
		/////////////////////////////////////////////////////
		System.out.println("Finding the factorial of 1...");

		int return_val2 = compute_factorial(1);
		
		System.out.print(return_val2);
		System.out.printf("%n");
		/////////////////////////////////////////////////////
		System.out.println("Finding the factorial of 5...");

		int return_val3 = compute_factorial(5);
		
		System.out.print(return_val3);
		System.out.printf("%n");
		/////////////////////////////////////////////////////
		System.out.println("Finding the factorial of 6...");
		
		int return_val4 = compute_factorial(6);
		
		System.out.print(return_val4);
	}
	
	/**
	 * 
	 * @param n the number for which we want the factorial
	 * @return
	 */
	public static int compute_factorial(int n) {
		int factorial_val = 1;
		
		// case 1
		if (n == 0 || n == 1) {
			factorial_val = 1;
		}
		
		else {
			for (int i=1; i<=n; i++) {
				factorial_val = factorial_val * i;
			}
		}
		
		return factorial_val;
	}

}
