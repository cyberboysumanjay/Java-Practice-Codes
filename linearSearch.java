import java.util.Scanner;


public class linearSearch {
	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a[]=new int[n];
		for (int i=0;i<n;i++){
			a[i] = s.nextInt();
		}
		return a;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int []arr= takeInput();
		int search= s.nextInt();
		int index= linearSearch(arr,search);
		System.out.println(index);
		
	}
	public static int linearSearch(int[] arr, int num){
		int index=0;
		for (int i=0;i<arr.length;i++){
			if (num==arr[i]){	
				 index=i;
			}
			else{
			     index=-1;
			}
		}
		return index;
	}
	
}
