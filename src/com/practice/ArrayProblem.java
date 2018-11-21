package com.practice;

import java.util.Arrays;

public class ArrayProblem {

	public static void main(String[] args) {
		int[] array = new int[]{1,2,3,2,1,3,1,2,1,3,1,1};
		
		int counter = array.length-1;
		for(int i=array.length-1;i>=0;i--){
			if(array[i] != 1){
				int temp = array[i];
				array[i] = 1;
				array[counter] = temp;
				counter--;
			}
		}
		counter = 0;
		for(int i=0;i<array.length;i++){
			if(array[i] != 2){
				int temp = array[i] ;
				array[i] = 2;
				array[counter] = temp;
				counter++;
			}
			System.out.println(counter);
		}
		
		System.out.println(Arrays.toString(array));
		
	}
}
