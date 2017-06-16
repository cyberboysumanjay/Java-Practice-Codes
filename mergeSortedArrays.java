import java.util.Arrays;


public class mergeSortedArrays {
	public static void printArray(int a[]) {
		for (int j=0;j<a.length;j++){
			System.out.println(a[j]);
		}
	}
	public static int[] merge(int arr1[], int arr2[]){
		int merged[]= new int [arr1.length+arr2.length];
		for (int i = 0; i < arr1.length; i++) {
			merged[i]=arr1[i];
		}
		for (int j=0; j< arr2.length; j++){
			merged[arr1.length+j]=arr2[j];
		}
		Arrays.sort(merged);
		return merged;
	}

	public static void main(String[] args) {
		int a[]={4,5,6,7,1,2,3,9,8};
		int b[]={11,34,23,54,78,12};
		int m[]=merge(a,b);
		printArray(m);
	}

}
