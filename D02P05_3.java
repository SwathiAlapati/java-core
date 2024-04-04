package com.learning.core.day2session1;



public class D02P05_3 {
	
	public static void main(String[] args)
	{
		String input="abc";
		printSubsequences(input);
	}
	public static void printSubsequences(String input)
	{
		generateSubsequences(input,"",0);
		}
	
		private static void generateSubsequences(String input, String current,int index) {
			if(index==input.length()) {
				System.out.print(current+",");
				return;
			}
			generateSubsequences(input,current+input.charAt(index),index+1);
			generateSubsequences(input,current,index+1);
	}

}
