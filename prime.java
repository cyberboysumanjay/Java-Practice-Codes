import java.util.Scanner;


public class prime {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n= s.nextInt();
		if (n==2) {
			System.out.println(2);
		}
		else{
			System.out.println(2);

			for (int i=0;i<=n;i++){
				int c=0;
				if(i%2==0){
					continue;
				}
				else{
					for (int j = 1; j <=i; j++) {
						if(i%j==0){
							c++;
						}
					}
					if (c==2){

						System.out.println(i);
					}
				}
			}
		}
	}
}