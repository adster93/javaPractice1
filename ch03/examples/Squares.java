package examples;
/* this program computes
the square of the inputed number */

public class Squares {
	public static void main(String[] args){
		//use a scanner to read from standard in
		java.util.Scanner scanner = new java.util.Scanner(System.in);

		int num = 0;
		int result = 0;
		int count = 0;

		System.out.print("Please enter a number: ");
		num = scanner.nextInt();
		// loop 5 times
	for (count = 0; count < 5; count = count+1){
		if(num < 46341) {
			result = num * num;
			System.out.print("The result of squaring " + num);
			System.out.println(" is: " + result);
		}
		else {
			System.err.println("Input # " + num + " is too large.");
		}
	}
		
		scanner.close();
	}
}