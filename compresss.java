public class Solution {

	public static String compress(String inp) {
		// Write your code here
		String ans = "";
		for(int i = 0; i< inp.length();++i) {
		    ans+=inp.charAt(i);
		    int count = 0;
		    while(i< inp.length()-1 && inp.charAt(i) == inp.charAt(i+1)) {
		        count++;
		        i++;
		    }
		    ans+=count==0?"":count;
		}
		
		return ans;

	}

}
