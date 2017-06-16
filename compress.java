
public class compress {
	public static String compress(String input) {
		String shortString=new String();
		shortString+= input.charAt(0);
		for (int i = 1; i < input.length(); i++) {
			shortString+= input.charAt(i);
			int count=1;
			if (input.charAt(i-1)==input.charAt(i)) {
				count++;

			}
			else{
				count=1;
			}
		}
		return shortString;
	}
	public static void main(String[] args) {
		String input="aaaabbccc";
		String outputString=compress(input);
		System.out.println(outputString);
	}
}
 