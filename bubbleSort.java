
public class bubbleSort {
	public static void main(String[] args) {
		int a[]={9,7,8,6,5,4,3,2,1};
		int sortedArray[]=bubbleSort(a);
		printArray(sortedArray);
	}
	
	public static void printArray(int a[]) {
		for (int j=0;j<a.length;j++){
			System.out.print(a[j]);
		}
	}
	
	
	public static void bubbleSort(int arr[]) {
		for (int i=0;i<arr.length-1;i++){
			for (int j=0;j<arr.length-i-1;j++){
				if (arr[j]>arr[j+1]){
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
}
