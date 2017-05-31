import java.util.Scanner;


public class differenceBtwEvenOdd {
	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a[]=new int[n];
		for (int i=0;i<n;i++){
			a[i] = s.nextInt();
		}
		return a;
	}
	public static int master(int a[]) {
		int sumEven=0,sumOdd=0;
		for (int i=0;i<a.length;i++){
			if (i%2==0){
				sumEven+=a[i];
			}
			else {
				sumOdd+=a[i];
			}
		}
		int result = sumEven-sumOdd;
		return result;
	}
	public static void main(String[] args) {
		int []a=takeInput();
		int result = master(a);
		System.out.println(result);
	}

}
