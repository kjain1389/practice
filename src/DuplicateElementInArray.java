
public class DuplicateElementInArray {
	public static void main(String[] args) {
		String[] strArray = {"Java", "JSP", "Servlets", "Java", "Struts", "JSP", "JDBC","Java"};
		
		for(int i=0;i<strArray.length;i++){
			for(int j=i+1;j<strArray.length;j++){
				if(strArray[i].equals(strArray[j]) && i != j){
					System.out.println("Duplicate is -------"+strArray[i]+"========"+strArray[j] );
				}
			}
		}
		  
	}
}
