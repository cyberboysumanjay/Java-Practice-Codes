import java.util.Scanner;


public class arraySum {
	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a[]=new int[n];
		for (int i=0;i<n;i++){
			a[i] = s.nextInt();
		}
		return a;
	}
	public static int summation(int a[]) {
		int sum=0;
		for (int i=0;i<a.length;i++){
			sum+=a[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		int []a=takeInput();
		int sum = summation(a);
		System.out.println(sum);
	}

}






