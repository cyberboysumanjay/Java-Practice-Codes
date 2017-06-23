public class Solution {
	public static void cubeFree(int n)
	{
	    int count=0;
		for (int i=2;i<n/3;i++){
            if(num%(i*i*i)!=0){
                count++;
            }		    
		}
		if (count!=0){
		    System.out.println(count);
		}
		else{
		    System.out.println("Not Cube Free");
		}
	}
}
