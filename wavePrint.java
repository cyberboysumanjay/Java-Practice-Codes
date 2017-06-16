import java.util.Scanner;


public class wavePrint {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);

		int m= scanner.nextInt();
		int n= scanner.nextInt();
		int[][] array= new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				array[i][j]= scanner.nextInt();
			}
		}

		for (int j = 0; j < array[0].length; j++) {
			if (j%2==0) {
				for (int i = 0; i < array.length; i++) {
					System.out.print(array[i][j]);
				}
			}
			else {
				for (int i = array.length-1; i>=1; i--) {
					System.out.print(array[i][j]);
				}
			}
		}
	}
}
