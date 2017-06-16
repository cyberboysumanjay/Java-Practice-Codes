import java.util.Scanner;


public class arrowPatter {
	public static void main(String arg[])
	{
		Scanner scanner=new Scanner(System.in);
		int n= scanner.nextInt();
		int i;
		int j;
		for( i=0;i<=(n-1)/2;i++)
		{
			for(j=0;j<=i;j++)
			{
				System.out.print(' ');
			}

			for(int k=0;k<=i;k++)
				System.out.print("* ");
			System.out.print("\n");
		}
		for( i=0;i<=((n-1)/2)-1;i++)
		{
			for(j=((n-1)/2)-1;j>=i;j--)
			{
				System.out.print(' ');
			}

			for(int k=((n-1)/2)-1;k>=i;k--)
				System.out.print("* ");
			System.out.print("\n");
		}
	}

}
