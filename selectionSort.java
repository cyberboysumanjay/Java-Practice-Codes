
public class selectionSort {
	public static void printArray(int a[]) {
		for (int j=0;j<a.length;j++){
			System.out.println(a[j]);
		}
	}

	public static void selectionSort(int []arr) {
		for (int i=0;i<arr.length;i++){
			for (int j=i;j<arr.length;j++){
				if(arr[i]>arr[j]){
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}


	public static void main(String[] args) {
		int a[]={3,4,5,2,1};
		selectionSort(a);
		printArray(a);
	}
}
