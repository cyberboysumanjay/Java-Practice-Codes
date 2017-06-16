
public class compressString {
	public static String compress(String inputString) {
	String compressed = "";
 
      char ch=0;
      int count=1;
      for (int i = 0; i < inputString.length(); i++) { 
         if (ch == inputString.charAt(i)){
            count += 1;
         } 
         else {
            compressed = compressed + ch;
            if(count != 1){
               compressed += count;
         }
            ch = inputString.charAt(i);
            count = 1;
         }
      }
      compressed = compressed + ch;
      if(count != 1){
         compressed+=count;
      }
    return compressed;
	}
	public static void main(String[] args) {
		String inputString="aaaaabbcddd";
		System.out.println(compress(inputString));
	}
}
