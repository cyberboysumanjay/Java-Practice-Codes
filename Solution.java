import java.util.Scanner;

public class Solution {

	public static int sumOfDigits(int input){
		// Write your code here
		if (input<10){
			return input;
		}
		int sum=0;
		sum+=input%10;
		input/=10;
		sum+=sumOfDigits(input);
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n= scanner.nextInt();
		int zeros= sumOfDigits(n);
		System.out.println(zeros);
	}
}
