import java.util.Scanner;


public class removeAllOccurence {
	public static String removeAllOccurrencesOfChar(String input, char c) {
		 String newString=new String();
		 for (int i = 0; i < input.length(); i++) {
			 if (input.charAt(i)!=c) {
				 newString+=input.charAt(i);
				}
			
		}
		return newString;

	}
	public static void main(String[] args) {
		String input="Welcome to coding Ninjas";
		Scanner scanner=new Scanner(System.in);
		char c= scanner.next().charAt(0);
		String outputString=removeAllOccurrencesOfChar(input, c);
		System.out.println(outputString);
	}
}
