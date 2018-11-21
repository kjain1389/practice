package com.unique.interview.questions.reverse;

public class NumberReversalPrograms {

	public int reverseNumber(int number){
        
        int reverse = 0;
        while(number != 0){
            reverse = (reverse*10)+(number%10);
            number = number/10;
        } 
        return reverse;
    }
	
	public int sumOfNumber(int number){
		
		int sum = 0;
		while(number != 0){
			sum += (number%10);
			number = number/10;
		} 
		return sum;
	}
     
    public static void main(String a[]){
    	NumberReversalPrograms nr = new NumberReversalPrograms();
        System.out.println("Result: "+nr.reverseNumber(17868));
        System.out.println("Result: "+nr.sumOfNumber(17868));
    }
}