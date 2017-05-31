import java.util.Scanner;

public class swapAlternate {
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
	public static void main(String[] args) {
		int a[]=takeInput();
		for (int i=0;i<a.length-1;i++){
			//int temp=0;
			if (i%2==0){
				int temp=a[i];
				a[i]=a[i+1];
				a[i+1]=temp;
			}
		}
		printArray(a);
	}


}
