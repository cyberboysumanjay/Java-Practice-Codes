import java.util.Scanner;
public class arrangeNumberInArray {
	public static int[] arrange(int n){
		int i=1,j=0;
		int arr[]=new int [n];
		while(j<=n){
			if(2*j+1<=n){
				arr[j]=2*j+1;			
			}
			j++;
		}
		while (n>0){
			if (n%2==0) {
				arr[(n-1)/2]=n;
			}
			else {
				if(n!=1){
					arr[(n-1)/2]=n;
				}
			}
			n-=2;
		}
		return arr;
	}
	public static void printArray(int a[]) {
		for (int j=0;j<a.length;j++){
			System.out.print(a[j]+" ");
		}
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n= s.nextInt();
		int b[]= arrange(n);
		printArray(b);
	
	}
}
