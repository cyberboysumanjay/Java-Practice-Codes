
public class insertionSort {
	public static void insertionSort(int[] arr){
		for (int i = 1; i < arr.length; i++) {
			int j=i-1;
			int temp=arr[i];

			while (j>=0) {
				if (temp<arr[j]){
					arr[j+1]=arr[j];
					j--;
				}
				else{
					break;
				}
			}
			
			arr[j+1]=temp;
		}
	}

	public static void main(String[] args) {
		int a[]={9,8,7,6,5,2,1,3,4};
		insertionSort(a);
		printArray(a);
	}

	public static void printArray(int a[]) {
		for (int j=0;j<a.length;j++){
			System.out.println(a[j]);
		}
	}
}
