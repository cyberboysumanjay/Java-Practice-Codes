import java.util.*;
public class pairSum {

	public static void pairSum(int[] arr, int num){
		Arrays.sort(arr);
		int i,j,k,n=arr.length;;
		for (i=0;i<n-1;i++){
			for (j=i+1;j<n;j++){

				if (arr[i]+arr[j]==num){
					if(arr[i]<=arr[j]){
						System.out.println(arr[i]+" "+arr[j]);
					}
				}
			}
		}
	}
}



