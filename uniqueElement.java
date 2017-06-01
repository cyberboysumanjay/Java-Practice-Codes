import java.util.*;;


public class uniqueElement {



	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a[]=new int[n];

		for (int i=0;i<n;i++){
			a[i] = s.nextInt();
		}
		return a;
	}
	public static int unique(int a[]) {
		int i=0,c,j=0,k=0,answr=0;
		for( i=0;i<a.length;i++){
			c=0;
			for (k=0;k<i-1;k++){
				if (a[k]==a[i]){
					c++;
				}
			}
			for (j=i+1;j<a.length;j++){

				if(a[i]==a[j]){
					c++;
				}
			}


			if (c==0){
				answr= a[i];
			}
		}
		return answr;


	}	

	public static void main(String[] args) {
		int arr[]=takeInput();
		int unique= unique(arr);
		System.out.println(unique);
	}


}
