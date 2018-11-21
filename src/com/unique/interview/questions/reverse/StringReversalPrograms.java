package com.unique.interview.questions.reverse;

import java.util.Arrays;

public class StringReversalPrograms {

	public static void main(String[] args) {
		
		String str = "Rahul";
		System.out.println("With Recursive : "+reverseWithRecursive(str));

		System.out.println("With Buffer : "+reverseWithBuffer(str));

		System.out.println("With Array : "+reverseWithArray(str));
	}
	
	public static String reverseWithRecursive(String str) {
		
		if(null == str || str.length() <= 1) {
			return str;
		}
		
		return reverseWithRecursive(str.substring(1)) + str.charAt(0);
	}
	
	public static String reverseWithBuffer(String str) {
		
		StringBuffer sb = new StringBuffer(str);
		return sb.reverse().toString();
	}
	
	public static String reverseWithArray(String str) {
		
		char[] charArray = str.toCharArray();
		char[] revereArray = new char[str.length()];
		
		int j = 0;
		for (int i = charArray.length - 1; i>=0; i--, j++) {
			revereArray[j] = charArray[i];
		}
		String string = Arrays.toString(revereArray);
		return string;
	}
}