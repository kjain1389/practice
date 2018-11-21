import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

public class DuplicateElementsInArray {
	
	public static void main(String[] args) {
		String[] arrayString = new String[]{"Java","java","jsp","jquery","jquery","jquery","java","Java","Spring","Spring"};
		System.out.println(Arrays.toString(arrayString));
		//HashMap<String	,Integer> map= new HashMap<>();
		
		for(int i=0;i<arrayString.length;i++){
			for(int j=i+1;j<arrayString.length;j++){
				if(i != j){
					if(arrayString[i].equals(arrayString[j])){
						System.out.println("DUplicate element is---"+arrayString[i]);
					}
				}
			}
		}
	}
}
