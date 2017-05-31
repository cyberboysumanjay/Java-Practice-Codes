import java.util.Scanner;


public class reverseArray {
	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a[]=new int[n];
		for (int i=0;i<n;i++){
			a[i] = s.nextInt();
		}
		return a;
	}
	public static void printArray(int a[]) {
		for (int j=0;j<a.length;j++){
			System.out.println(a[j]);
		}
	}
	public static void reverseArray(int a[]) {
		int temp=0;
		for (int i=0;i<a.length/2;i++){
			temp=a[i];
			a[i]=a[a.length-i-1];
			a[a.length-i-1]=temp;
		}
		printArray(a);
	}
	public static void main(String[] args) {
		int a[]= takeInput();
		
		reverseArray(a);
		//printArray(a);
	
	}
}
