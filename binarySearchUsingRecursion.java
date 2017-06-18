public class solution {
	public static int binarySearch(int input[], int element) {
		return search(input,element,0,input.length-1,input.length-1/2);

	}
	public static int search(int input[], int element, int f,int l,int m){
	  
	        m=(f+l)/2;
	    if (element>input[m]){
	        f=m+1;
	        return search(input,element,f,l,m);
	    }
	    if (element<input[m]){
	        l=m-1;
	        return search(input,element,f,l,m);
	    }
	    if (input[m]==element){
	        return m;
	    }
	    return -1;
	}
}
