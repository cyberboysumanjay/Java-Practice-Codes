
public class replacePie {
	public static String helper(String input,int startIndex){
		String newString="";
		if(input.charAt(startIndex)=='p'&& input.charAt(startIndex+1)=='i'){
			newString+="3.14";
			return newString;
		}
		else {
			newString+=input.charAt(startIndex);
		}
		String addString=helper(input,startIndex+1);
			newString+=addString;
			return newString;
	}
	public static String replace(String input){
		return helper(input,0);
	}
}
