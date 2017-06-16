import java.util.Scanner;

public class checkFibonacci
{    
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int firstTerm = 0;
		int secondTerm = 1;
		int thirdTerm = 0;
		while (thirdTerm < n)
		{
			thirdTerm = firstTerm + secondTerm;
			firstTerm = secondTerm;
			secondTerm = thirdTerm;
		}
		if(thirdTerm == n)
		{
			return true;
		}

	}    
}