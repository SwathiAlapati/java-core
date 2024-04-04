package com.learning.core.day1session1;

import java.util.ArrayList;
import java.util.Scanner;
public class D01P04_4 {
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the array of numbers:");
		String numString=scanner.next();
		System.out.print("Enter the value of k:");
		int k=scanner.nextInt();
		int[] nums=new int[numString.length()];
		for(int i=0;i<numString.length();i++) {
			nums[i]=numString.charAt(i)-'0';
			}
		ArrayList<String> combinations=findCombinations(nums,k);
		System.out.println("Distinct combinations:");
		for(String combination:combinations) {
			System.out.print(combination+" ");
		}
	}
	private static ArrayList<String>findCombinations(int[] nums, int k){
		ArrayList<String> combinations=new ArrayList<>();
		StringBuilder sb=new StringBuilder();
		findCombinationsHelper(nums,k,0,sb,combinations);
		return combinations;
	}
	private static void findCombinationsHelper(int[] nums,int k, int start, StringBuilder sb,ArrayList<String> combinations) {
		if(sb.length()==k) {
			combinations.add(sb.toString());
			return;
		}
		for(int i=start;i<nums.length;i++) {
			sb.append(nums[i]);
			findCombinationsHelper(nums,k,i+1,sb,combinations);
			sb.deleteCharAt(sb.length()-1);
		}
	}

}
