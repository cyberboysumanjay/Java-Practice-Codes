import java.util.Arrays;


public class sortBinaryArray {
	
	public static void sortBinaryarray(int arra[]) {
		Arrays.sort(arra);
	}
	
	public static void printArray(int a[]) {
		for (int j=0;j<a.length;j++){
			System.out.println(a[j]);
		}
	}
	
	public static void main(String[] args) {
	int a[]={7,5,3,6,78,65,645,64,56,4};
	sortBinaryarray(a);
	printArray(a);
	
	}
}
