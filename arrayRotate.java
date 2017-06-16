import java.util.Scanner;
public class arrayRotate {
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
			System.out.print(a[j]+" ");
		}
	}
	public static int main(String[] args) {
		int arr[]=takeInput();
		Scanner s = new Scanner(System.in);
		int d= s.nextInt();
		rotate(arr,d);
		printArray(arr);
	}

	public static void rotate(int[] arr, int d) {
	
	}
}