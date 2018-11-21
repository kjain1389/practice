
public class FirstAndSecondLargest {
	
	String i = "test";
			
			
	public static void main(String[] args) {
		int[] a = new int[]{51,51,28,75,49,42,154,1232,122};
		
		int firstLargest = 0;
		int secondLargest = 0;
		if(a[0] > a[1]){
			firstLargest = a[0];
			secondLargest = a[1];
		}else{
			firstLargest = a[1];
			secondLargest = a[0];
		}
		
		for(int i=2;i<a.length;i++){
			if(a[i] > firstLargest){
				secondLargest = firstLargest;
				firstLargest = a[i];
			}
			
			if(a[i] < firstLargest && a[i] > secondLargest){
				secondLargest = a[i];
			}
		}
		
		System.out.println(firstLargest);
		System.out.println(secondLargest);
		System.out.println();
	}
	
	public void test(){
		System.out.println(i);
	}
	

}
