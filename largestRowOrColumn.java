import java.util.*;
public class largestRowOrColumn {
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
		int indexRow=0,indexCol=0;
		int maxColSum = Integer.MIN_VALUE;
		int maxRowSum = Integer.MIN_VALUE;
		for (int i = 0; i < m; i++) {
			int rowSum=0;
			for (int j = 0; j < n; j++) {
				rowSum+=array[i][j];
				if (rowSum>maxRowSum){
					indexRow=i;
					maxRowSum=rowSum;
				}
			}
		}
		for (int j = 0; j < m; j++) {
			int colSum=0;
			for (int i = 0; i < n; i++) {
				colSum+=array[i][j];
				if (colSum>maxColSum){
					indexCol=i;
					maxColSum=colSum;
				}
			}
		}
		if (maxColSum>maxRowSum) {
			System.out.println("column"+" "+indexCol+" "+maxColSum);
		}
		else{

			System.out.println("row"+" "+indexRow+" "+maxRowSum);
		}
	}
}
