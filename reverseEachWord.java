
public class reverseEachWord {





/*	public static String reverseThisWord(int start,int end,String input){
		String revString= new String();
		for (int i=start;i<end;i++){
			revString+=input.charAt(end-i);
		}
		return revString;
	}




	public static String reverseEachWord(String input) {
		int start=0,end=0;
		String revWord=new String();
		String rev=new String();
		for (int i=0;i<input.length();i++){
			if (input.charAt(i)== ' ' || i==end) {
				end=i-1;
				revWord=reverseThisWord(start,end,input);

			}

			rev+=revWord;	
		}
		return rev;
	}
*/
	static String reverseEachWord(String inputString)
    {
        String[] words = inputString.split(" ");
        String reverseString = "";
        for (int i = 0; i < words.length; i++) 
            String word = words[i];
            String reverseWord = "";
            for (int j = word.length()-1; j >= 0; j--) 
            {
                reverseWord += word.charAt(j);
            }
             
            reverseString +=reverseWord + " ";
        }
        return reverseString;
    }


	public static void main(String[] args) {
		String input="abcd efgh";
		String output=reverseEachWord(input);
		System.out.println(output);
	}
}
