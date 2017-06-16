public class test{	

	public static int findUnique(int arr[]) {



		int unpaired = arr[0];
		for(int i = 1; i < arr.length; i++){
			unpaired = unpaired ^ arr[i];

		}
		return unpaired;
	}	
}