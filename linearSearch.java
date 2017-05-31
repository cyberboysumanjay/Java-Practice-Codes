import java.util.Scanner;


public class linearSearch {
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
		Scanner s = new Scanner(System.in);
		int []a=takeInput();
		int search= s.nextInt();
		int index= linearSearch(a,search);
		System.out.println(index);
		
	}
	public static int linearSearch(int a[],int n) {
		int index=0;
		for (int i=0;i<n;i++){
			if (n==a[i]){	
				 index=i;
			}
		}
		return index;
	}
	
}
