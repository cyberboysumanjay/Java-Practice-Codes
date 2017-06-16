import java.util.Arrays;
import java.util.Scanner;


public class Q4Practice {
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
	public static void main(String[] args) {
		int a[]=takeInput();
		Arrays.sort(a);
		int b[]=new int[a.length];
		 
		for (int i = 0; i < a.length-1; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[i]+a[j]==0) {
					b[i]=a[i];
					b[i+1]=a[j];
				}
			}
		}
	printArray(b);	
	}
}
