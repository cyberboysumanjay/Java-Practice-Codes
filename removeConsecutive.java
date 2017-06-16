import java.util.Scanner;


public class removeConsecutive {
	public static String removeConsecutiveDuplicates(String input){
		String shortString=new String();
		shortString+= input.charAt(0);
		for (int i = 1; i < input.length(); i++) {
			if (input.charAt(i-1)!=input.charAt(i)) {
				shortString+= input.charAt(i);
			}
		}
		return shortString;
	}
	
	public static void main(String[] args) {
		String input="baabbsbbahsahbahshhbhsjjjj";
		String outputString=removeConsecutiveDuplicates(input);
		System.out.println(outputString);
}
}
