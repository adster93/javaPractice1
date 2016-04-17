package examples;

public class StudentScores {
	public static void main(String[] args){
		int score1 = 90;
		int score2 = 85;
		int score3 = 79;
		int score4 = 100;
		int average = ((score1 + score2 + score3 + score4) / 4);
		System.out.print("The scores are: " + score1 + ", " + score2 
			+ ", " + score3 + ", " + score4 + ". The average score is: " + average);
	}
}