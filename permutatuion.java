import java.util.Arrays;
public class permutatuion {
	public static boolean isPermutation(String input1, String input2) {
		boolean state=true;
		char inputCh1[]=input1.toCharArray();
		char inputCh2[]=input2.toCharArray();
		Arrays.sort(inputCh1);
		Arrays.sort(inputCh2);
		if (input1.length()==input2.length()){
			for (int i = 0; i < inputCh2.length; i++) {
				if (inputCh1[i]==inputCh2[i]) {
					state=true;
				}
				else {
					state=false;
				} 
			}

		}
		else {
			state=false;
		}
		return state;

	}
}
