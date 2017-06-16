import java.util.Scanner;


public class linearSearch2 {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int a[]={9,8,7,6,5,4,3,2,1,11,12,113,14,15,16,17,18};
		int num=s.nextInt();
		int index= linearSearch(a,num);
		System.out.println(index);

	}
	private static int linearSearch(int a[],int num) {
		int i=0,index=-1;
		for (i=0;i<17;i++){

			if (a[i]==num) {
				index=i;
			}

		}
		
		return index;
	}
}
