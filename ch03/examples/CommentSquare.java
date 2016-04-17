package examples;

public class CommentSquare {
	public static void main(String[] args){
		//scanner input for user
		java.util.Scanner scanner = new java.util.Scanner(System.in);

		int num = 0;
		int result = 0;
		int count = 0;

		System.out.print("Please enter a number (less than 46341): ");

		num = scanner.nextInt();

		for (count = 0; count < 5; count = count+1){
		if(num < 46341) {
			result = num * num;
			System.out.print("The result of squaring " + num);
			System.out.println(" is: \t" + result);
		}
		else {
			System.err.println("Input # " + num + " is too large.");
		}
	}
		
		scanner.close();
	}
}