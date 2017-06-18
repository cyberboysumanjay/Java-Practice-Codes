import java.util.*;
public class solution {

    	public static void printSubsequences(String input) {
        String[] in=subsequence(input);
        Arrays.stream(in).forEach(System.out::println);
    	}
		public static String[] subsequence(String input){
		if(input.length()==0){
		    String ans[]=new String[1];
		    ans[0]="";
		    return ans;
		}
		String smallAns[]=subsequence(input.substring(1));
		String output[]=new String[2*smallAns.length];
		int j=0;
		for (int i=0;i<smallAns.length;i++,j++){
		    output[j]=smallAns[i];
		}
		for(int i=0;i<smallAns.length;i++){
		    output[j]=input.charAt(0)+smallAns[i];
		    j++;
		}
		return output;
	}
}
