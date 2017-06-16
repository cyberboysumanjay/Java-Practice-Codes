import java.util.Scanner;

public class duplicateElementInArray {
	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a[]=new int[n];
		for (int i=0;i<n;i++){
			a[i] = s.nextInt();
		}
		return a;
	}
	public static int duplicate(int[] arr){ 
		int ogsum=0;
		int n=arr.length;
		int sum=n*(n-1)/2;
		for (int i=0;i<arr.length;i++){
			ogsum=ogsum+arr[i];
		}
		int unique=(n-1)-sum+ogsum;
		return unique;
	}
	public static void main(String[] args) {
		int []arr=takeInput();
		int unique=duplicate(arr);
		System.out.println(unique);
	}
}
