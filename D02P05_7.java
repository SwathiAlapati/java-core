package com.learning.core.day2session1;

import java.util.ArrayList;
import java.util.List;

public class D02P05_7 {

	public static void main(String[] args) {
		String[] dictionary = {"Abb","abc","xyz","xyy","Foo"};
		String pattern = "xyz";
		
		List<String>matchedStrings = findMatchingStrings(dictionary, pattern);
		
		System.out.print("String in the dictionary matching the pattern" +pattern+ ":");
		for(String str:matchedStrings)
		{
			System.out.print(str);
		}
	}
 public static List<String>findMatchingStrings(String[] dictionary,String pattern){
	 List<String> matchedStrings = new ArrayList<>();
	 
	 for(String str : dictionary) {
		 if(matchespattern(str,pattern)) {
			 matchedStrings.add(str);
		 }
	 }
	return matchedStrings;
	 
 }
 private static boolean matchespattern(String str, String pattern) {
	 if(str.length()!= pattern.length()) {
		 return false;
	 }
	 for(int i = 0;i<str.length();i++) {
		 if(pattern.charAt(i)!='X' && pattern.charAt(i)!= str.charAt(i)) {
			 return false;
		 }
	 }
	return true;
	 
 }
}