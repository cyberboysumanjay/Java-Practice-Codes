
public class arrNoInArray {
	
	public static int[] arrange(int n){
		int a[]=new int [n];
		int j=0;
		for (int i=1;i<=n;i+=2){
			a[j]=i;
			j++;
		}
		while(n>=2){
			if (n%2==0) {
				j=n/2 +1;
				a[j]=n;
				
			}
			else {
				j=n/2 +1;
				a[j]=n-1;
			}
			n-=2;
		}
	return a;
	}
}

