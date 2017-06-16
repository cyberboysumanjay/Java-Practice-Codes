import java.util.*;
public class secondLargestNumberInArray {

	public static int secondLargestElement(int[] arr){
		Arrays.sort(arr);
		for (int i = arr.length; i>0; i--) {
			if (arr[i]>arr[i-1]) {
				return arr[i-1];
			}
		}
	return -1;
	
	}
}
