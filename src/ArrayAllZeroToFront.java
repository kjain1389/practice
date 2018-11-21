import java.util.Arrays;

public class ArrayAllZeroToFront {

	public static void main(String[] args) {
		int[] array = new int[]{2,5,7,9,6,0,1,0,2,4,0,5,3,0};
		//int counter = 0;
		int counter = array.length-1;
		for(int i=array.length-1;i>=0;i--){
			if(array[i] != 0){
				int temp = array[i];
				array[i] = 0;
				array[counter] = temp;
				counter--;
			}
		}
		System.out.println(Arrays.toString(array));
		
		
	}
}
