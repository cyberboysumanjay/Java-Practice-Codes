import java.util.Arrays;
public class Intersection{
    
    public static void findIntersection(int array1[], int array2[]) {
		int n1 = array1.length;
		int n2 = array2.length;
		int i = 0, j = 0;
		for(;i < n1 && j < n2;) {
			if(array1[i] < array2[j]) {
				i++;
			} else if(array2[j] < array1[i]) {
				j++;
			} else {
				System.out.println(array1[i++]);
				j++;
			}
		}
	}

	public static void intersection(int[] arr1, int[] arr2){
	    Arrays.sort(arr1);
	    Arrays.sort(arr2);
		findIntersection(arr1, arr2);
	}
}
