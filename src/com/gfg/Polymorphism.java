package com.gfg;

import java.util.HashSet;

class A {
	public Number test(int i, Integer j){
		return 1;
	}
	public Integer test(Integer i, int j){
		return 2;
	}
	
	public String test1(String s){
		return "String";
	}
	
	public String test1(Object s){
		return "Object";
	}
	
}
public class Polymorphism extends A{
	public Integer test(int i, double j){
		return 1;
	}
	public static void main(String[] args) {
		////////////////////////////////////////////////////
		A a = new A();
//		a.test(1, 1);
		System.out.println(a.test1(1));
//////////////////////////////////////////////////
		String s3 = "JournalDev";
		int start = 1;
		char end = 5;
		System.out.println(start + end);
		System.out.println(s3.substring(start, end));
//////////////////////////////////////////////////
		HashSet shortSet = new HashSet();
		for (short i = 0; i < 100; i++) {
			shortSet.add(i);
			
			
			System.out.println(shortSet.remove(i - 1));
		}
		System.out.println(shortSet.size());
		System.out.println(shortSet);
//////////////////////////////////////////////////
		boolean flag = true;
		//boolean flag = false;
		/*try {
			if (flag) {
				while (true) {
					System.out.println("1");
				}
			} else {
				System.exit(1);
			}
		} finally {
			System.out.println("In Finally");
		}
*/
//////////////////////////////////////////////////		
		/*String str = null;
		String str1="abc";
		System.out.println(str1.equals("abc") | str.equals(null));*/
		String x = "abc";
		String y = "abc";
		x.concat(y);
		System.out.println(x);
		
		int ab= 10*10-10;
		
		System.out.println(ab);
	}
}
