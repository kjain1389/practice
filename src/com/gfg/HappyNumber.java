package com.gfg;

public class HappyNumber {
	public static int number = 3;
	public static void main(String[] args) {
		
		square(3);
	}
	
	
	static void square(int num){
		int sum = 0;
		while(num!=0){
			sum = sum+((num%10)*(num%10));
			num = num/10;
		}
		System.out.println(sum);
		if(sum != 1 && sum != number){
			square(sum);	
		}else{
			if(sum == number){
				System.out.println("Not Happy");
			}
			if(sum == 1){
				System.out.println("Happy");	
			}
		}
	}
}
