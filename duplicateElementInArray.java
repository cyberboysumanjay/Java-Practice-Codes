import java.util.Scanner;


public class duplicateElementInArray {
	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a[]=new int[n];
		for (int i=0;i<n;i++){
			a[i] = s.nextInt();
		}
		return a;
	}
	public static int[] sort() {
		int a[]=takeInput();
		for (int i=0;i<a.length-1;i++)
		{
			for (int j=0;j<a.length-i-1;j++)
			{
				if (a[j]>a[j+1])
				{
					int temp=0;
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		return a;
	}
	public static void main(String[] args) {
		int arr[]=sort();
		for(int i=0;i<arr.length;i++){
			if (arr[i]==arr[i+1]){
				System.out.println(arr[i]); 
			}
		}
	}

}
