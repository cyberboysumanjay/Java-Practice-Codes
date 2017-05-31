import java.util.Scanner;


public class arrays {
	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a[]=new int[6];
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
	public static int largest(int a[]) {
		int max=a[0];
		for (int i=0;i<a.length;i++){
			if (a[i]>max){
				max=a[i];
			}
		}
		
		return max;
	}
	public static void main(String[] args) {
		int a[]= takeInput();
//		printArray(a);
		int max =largest(a);
		System.out.println(max);



	}
}
