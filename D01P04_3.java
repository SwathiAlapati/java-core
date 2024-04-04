package com.learning.core.day1session1;

//import java.util.*;

public class D01P04_3 {
	
	public static int FRE(int[] arr, int n) {
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++)
			{
				if(arr[i] == arr[j]) {
					return i;
					
				}
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] arr= {7,10,5,3,4,3,5,6};
		int n=arr.length;
		int index=FRE(arr,n);
		if(index == -1) {
			System.out.println("No repaeting element found");		
	}
	else {
		System.out.println(" "+ arr[index]);
		
	}
	}
}
	


