
public class min {
		public static String reverseEachWord(String inputString) {
			int index=0;
			String[] words = inputString.split(" ");
			
			for (int i = 0; i < words.length-1; i++) {
				String word =words[i];
				for (int j = 0; j <words.length; j++) {
					if (words[i].length()<words[j].length()) {
					
						index=i;
					}
				}
			}
			return words[index];
		}




		public static void main(String[] args) {
			String inputString="Coding ninja is awesome good";
			String minLength=reverseEachWord(inputString);
			System.out.println(minLength);
		}

}
