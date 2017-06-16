import java.util.Scanner;
import java.util.*;

public class mergeSort {

	



	public static int[] merge(int arr1[], int arr2[]){
		int merged[]= new int [arr1.length+arr2.length];
		for (int i = 0; i < arr1.length; i++) {
			merged[i]=arr1[i];
		}
		for (int j=0; j< arr2.length; j++){
			merged[arr1.length+j]=arr2[j];
		}
		Arrays.sort(merged);
		return merged;
	}
	
	public static void printArray(int a[]) {
		for (int j=0;j<a.length;j++){
			System.out.print(a[j]);
		}
	}

	public static int[] mergeSort(int[] input){
		//Base case
		if(input.length==1){
			return input;
		}
		//Created 2 new arrays and copied elements
		int a1[]=new int[input.length/2];
		int a2[]=new int[input.length-(input.length/2)];
		for (int i=0;i<input.length/2;i++){
			a1[i]=input[i];
		}
		for (int i=0;i<input.length-input.length/2;i++){
			a2[i]=input[(input.length/2)+i];
		}
		//called recursion on 2 arrays
		mergeSort (a1);
		mergeSort (a2);

		//merged sorted arrays
		int sorted[]=merge(a1,a2);
		return sorted;
		//printArray(sorted);
	}
	public static void main(String[] args) {
		int a[]={6,5,4,7,8,3,3,2,1,0};
		int b[]=mergeSort(a);
		printArray(b);
	}
}
