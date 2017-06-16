public class minWord {
	public static String minLengthWord(String inputString) {
		int index=0;
		String[] words = inputString.split(" ");
		String minLength= words[0];
		for (int i=1;i< words.length;i++) {
			if (minLength.length()>words[i].length()) {
				minLength=words[i];
			}
		}
		return minLength ; 
	}

	public static void main(String[] args) {
		String inputString="Coding ninjas gives many any of assignment";
					String minLength=minLengthWord(inputString);
					System.out.println(minLength);
	}
}
