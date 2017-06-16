import java.util.Scanner;


public class findFibonacci {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		System.out.println(fib(n+1));
	}

	private static int fib(int n) {
		int a = 0;
		int b = 1;

		for (int i = 2; i <= n; i++) {
			int temp = a;
			a = a + b;
			b = temp;
		}
		return a;
	}
}
