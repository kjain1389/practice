package com.practice;

import java.util.Arrays;

public class StringAnagram {
	public static void main(String[] args) {
		String s1 = "kshitij";
		String s2 = "skhitij";
		System.out.println(checkIfStringIsAnagram(s1,s2));
	}

	private static String checkIfStringIsAnagram(String s1, String s2) {
		if(s1.length() != s2.length()){
			return "Strings are not anagram";
		}
		char[] c = s1.toCharArray();
		char[] c1 = s2.toCharArray();
		Arrays.sort(c);
		Arrays.sort(c1);
		String str1 = new String(c);
		String str2 = new String(c1);
		if(str1.equals(str2)){
			return "Strings are anagram";
		}
		return "Strings are not anagram";
	}
}
