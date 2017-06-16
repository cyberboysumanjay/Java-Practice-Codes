
public class removeDuplicates {
	public static String removeConsecutiveDuplicates(String s) {
		// Write your code here
		return clean(s,0);

	}
	public static String clean(String s,int startIndex) {
		String cleanString="";
		cleanString+=s.charAt(startIndex);
		if (startIndex==s.length()) {
			return cleanString;
		}
		if (cleanString.charAt(startIndex)!=s.charAt(startIndex)+1){
			cleanString+=s.charAt(startIndex+1);
		}
		cleanString+=clean(s, startIndex+1);
				
		return cleanString;
	}
}
