import java.util.Scanner;


public class question {
	public static void main(String[] args) {
		int i=0,n=2;
		Scanner s= new Scanner(System.in);
		int num= s.nextInt();
		while (num=>n){
			for(i=2;i<n;i++){
				if (n%i==0) {
					if (i==n-1) {
						System.out.println(n);
					}
					i++;
				}
				n++;
			}
		}
	}	
}
