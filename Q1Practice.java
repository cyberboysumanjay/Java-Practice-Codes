import java.util.Scanner;


public class Q1Practice {

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
		int a[]=takeInput();
		int index=-1;
		for (int i = 1; i <  a.length-1; i++) {
			int sum1=0,sum2=0;
				for (int j = 0; j < i; j++) {
					sum1+=a[j];
				}
				for (int j = i+1; j < a.length; j++) {
					sum2+=a[j];
				}
			if (sum1==sum2) {
				 index= i;
			}	
		}
		System.out.println(index);
		
	}
}
