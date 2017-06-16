
public class replaceCharacter {

	public static String replaceCharacter(String input, char c1, char c2) {
		
		return updatedString(input, c1,c2, 0);
	}
	public static String updatedString(String input, char c1,char c2,int startIndex){
		String newString="";
		if (input.charAt(startIndex)==c1) {
			newString+=c2;
		}
		else if (input.charAt(startIndex)!=c1) {
			newString+=input.charAt(startIndex);
		}
		newString+=updatedString(input, c1, c2, startIndex+1);
		return newString;
	}
}
