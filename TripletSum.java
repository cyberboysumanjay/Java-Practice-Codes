import java.util.Arrays;

public class TripletSum {	

	
	
	public static void FindTriplet(int[] arr, int x){
		Arrays.sort(arr);
		int i,j,k,c=0,n=arr.length;;
		for (i=0;i<n-2;i++){
			for (j=i+1;j<n-1;j++){
				for (k=j+1;k<n;k++){
					if (arr[i]+arr[j]+arr[k]==x){
						if(arr[i]<=arr[j] && arr[j]<=arr[k]){
							System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
							c++;
						}
					}
				}
			}
		}
	}
}