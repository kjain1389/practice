import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraySorting {

	public static void main(String[] args) {
		int[] array = new int[]{4,6,5,8,4,2,3,9,1};
		//int[] sortedArray = new int[array.length];
		
		//System.out.println(Arrays.toString(array));
		for(int i=0;i<array.length-1;i++){
			for(int j=i+1;j<array.length;j++){
				if(array[i] > array[j]){
					int temp = array[j];
					array[j] = array[i];
					array[i] = temp;
					
				}
			}
		}
		for(int i=0;i<array.length;i++){
			System.out.println(array[i]);
		}
		System.out.println(Arrays.toString(array));
		
		//left angle 
		for(int i=0;i<5;i++){
			for(int j=0;j<=i;j++){
				System.out.print("*");
			}
			System.out.println("");
		}
		final int LIMIT = 5;
		for(int i=LIMIT-1;i>=0;i--){
			for(int j=0;j<=i;j++){
				System.out.print("*");
			}
			System.out.println("");
		}
		
		//left angle 
		
		for(int i=LIMIT-1;i>=0;i--){
			for(int j=0;j<LIMIT;j++){
				if(j<i){
					System.out.print(" ");
				}else{
					System.out.print("*");					
				}
			}
			System.out.println("");
		}
		
		
		String[] inputArray1 = {"ONE", "TWO", "THREE", "FOUR", "FIVE", "FOUR"};
		Arrays.sort(inputArray1);
		List<String> t = Arrays.asList(inputArray1);
	
		//t.add("ss");
		Collections.sort(t);
		System.out.println(t);
		
		
		
	}
}
