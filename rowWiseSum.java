import java.util.Scanner;
public class rowWiseSum {
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
		
		//int array[][]={{1,2,3,4},{2,4,6,8}}
		for (int j = 0; j < m; j++) {
			int sum=0;
			for(int i=0;i<n;i++){
				sum+=array[j][i];
			}
			System.out.print(sum+" ");
		}
	}
}
