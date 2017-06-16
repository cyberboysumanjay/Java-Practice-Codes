public class maxFrequency {
	public static String MaxOccuredChar(String str) {
		char[] array = str.toCharArray();
		int maxCount = 1;
		char maxChar = array[0];
		for(int i = 0, j = 0; i < str.length() - 1; i = j){
			int count = 1;
			while (++j < str.length() && array[i] == array[j]) {
				count++;
			}
			if (count > maxCount) {
				maxCount = count;
				maxChar = array[i];
			}
		}
		return (maxChar + " = " + maxCount);
	}
	public static void main(String[] args) {
		String str1=MaxOccuredChar("iaansttttanceofjava");
		System.out.println(str1);
	}
}
