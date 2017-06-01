import java.util.Scanner;


public class binarySearch {
	
	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a[]=new int[n];
		for (int i=0;i<n;i++){
			a[i] = s.nextInt();
		}
		return a;
	}

	public static int binarySearch(int arr[], int num) {

		int f = 0,index=0;
		int l = arr.length - 1;
		int m = (f+l)/2;

		while (f <= l)
		{
			if (arr[m] < num)
				f= m+1;
			else if (arr[m] == num)
			{
				index= m;
				break;
			}
			else{
				l = m - 1;
				m = (f+l)/2;
			}
			
		}
		if (f > l){
			index= -1;
		}
		return index;
	}
		public static void main(String[] args) {
			int a[]=takeInput();
			Scanner s = new Scanner(System.in);
			int num = s.nextInt();
			
			System.out.println(binarySearch(a,num));
		}
	}
