import java.util.*;;


public class uniqueElement {



	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a[]=new int[n];

		for (int i=0;i<n;i++){
			a[i] = s.nextInt();
		}
		return a;
	}
	
	public static int findUnique(int arr[]) {



		int unpaired = arr[0];
		for(int i = 1; i < arr.length; i++){
			unpaired = unpaired ^ arr[i];

		}
		return unpaired;
	}	

	public static void main(String[] args) {
		int arr[]=takeInput();
		int unique= unique(arr);
		System.out.println(unique);
	}


}
