package com.learning.core.day1session1;

public class D01P04_2 {
	public static void main(String[] args) {
		int[] a= {3,2,4,5,6,4,5,7,3,2,3,4,7,1,2,0,0,0};
		int sum=0;
		for(int i=0;i<=14;i++) {
			sum+=a[i];
		}
		a[15]=sum;
		double average=(double) sum/18;
		a[16]=(int) average;
		int smallest=a[0];
		for(int i=1;i<18;i++) {
			if (a[i]<smallest) {
				smallest=a[i];
			}
		}
		a[17]=smallest;
		
		for(int num:a) {
			System.out.print(num+" ");
		}
	}

}
