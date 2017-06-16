import java.util.Arrays;
import java.util.Scanner;
public class Q3Practice {
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
		boolean state=false;
		Arrays.sort(a);
		for (int i = 0; i < a.length-1; i++) {
			if (a[i+1]-a[i]==1) {
				state=true;
			}
		}
		System.out.println(state);
	}
}
