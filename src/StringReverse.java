
public class StringReverse {

	
	public static void main(String[] args) {
		String s = "I Love My India";
		System.out.println("Recurssion");
		System.out.println(recursion(s));
		System.out.println("String Buffer");
		System.out.println(withStringBuffer(s));
		System.out.println("Basic Array");
		System.out.println(withBasicArray(s));
		System.out.println("Half Length");
		System.out.println(withHalfLength(s));
		
	}
	
	public static String recursion(String s){
		if(s.length() <= 1){
			return s;
		}
		
		return recursion(s.substring(1)) + s.charAt(0);
	}
	
	
	public static String withStringBuffer(String s){
		StringBuffer sb = new StringBuffer(s);
		return sb.reverse().toString();
	}
	
	public static String withBasicArray(String s){
		char[] array = s.toCharArray();
		String string = "";
		for(int i=s.length()-1;i>=0;i--){
			string = string+array[i];
		}
		return string;
	}
	
	public static String withHalfLength(String s){
		char[] array = s.toCharArray();
		String string = "";
		int length = s.length()/2;
		char temp;
		for(int i=0 ; i < length ;i++){
			temp = array[i];
			array[i] = array[s.length()-1-i];
			array[s.length()-1-i] = temp;
		}
		
		/*char[] s = orig.toCharArray();
	    int n = s.length;
	    int halfLength = n / 2;
	    System.out.println(halfLength);
	    for (int i=0; i<halfLength; i++)
	    {
	        char temp = s[i];
	        s[i] = s[n-1-i];
	        s[n-1-i] = temp;
	    }
		*/
		
		String str = new String(array);
		return str;
		
	}
	
	
}
