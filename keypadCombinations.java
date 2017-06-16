public class solution {
    public static String[] keypad(int n){
        if (n==0){
              String ans[]=new String[1];
		    ans[0]="";
		    return ans;
        }
        else{
    		int digit=n%10;
    		String subString=contains(digit);
    		String out[]=combination(subString);
    		keypad(n/10);
    		return out;
    	}
    	
    }
	public static String[] combination(String input){
// 		if(input.length()==0){
// 		    String ans[]=new String[1];
// 		    ans[0]="";
// 		    return ans;
// 		}
	//	String smallAns[]=combination(input.substring(1));
		String output[]=new String[2];
        for (int i=0;i<1;i++){
	    	for(int j=0;j<1;j++){
		    output[i]=input.charAt(i)+input.charAt[j];
		}
		return output;
	}
	
	
	public static String contains(int digit){

		String elements;
		switch (digit) {
		case 2:  elements = "abc";
		return elements;
		case 3:  elements = "def";
		return elements;
		case 4:  elements = "ghi";
		return elements;
		case 5:  elements = "jkl";
		return elements;
		case 6:  elements = "mno";
		return elements;
		case 7:  elements = "pqrs";
		return elements;
		case 8:  elements = "tuv";
		return elements;
		case 9:  elements = "wxyz";
		return elements;
		default: 
			return "";
			
		}
	}
}
