import java.util.*;
public class Increasing {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s=new Scanner(System.in);
        System.out.print("enter n=");
        int n=s.nextInt();
        int j,i,k;
        int[] a=new int[10];
        System.out.println("enter the array:");
        for(i=0;i<n;i++)
            a[i]=s.nextInt();
        for( i=0;i<n;i++){
            if(a[i]<a[i+1])
              break;
        }
        int c=0,b=0;
         System.out.print(i);
        for( j=i;j<n;j++){
            if(a[j]>a[j+1])
                break;
            }
        System.out.print(j);
        for(  k=j;k<n;k++ ){
            if(a[k]<a[k+1])
                break;
        }
         System.out.print(k);
         if(k==n)
            System.out.println("true");
        else
            System.out.println("false");
    }
}