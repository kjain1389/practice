/**
 * 
 */
package statics;


class MyStaticExampleOuterClass {
	
	private int myId;//cannot access by static class as it is non static
	
	static class MyStaticInnerClasss {
		public void displayStatic() {
			System.out.println("static classes");
		}
	}
}

class MyInnerExampleOuterClass {
	
	public int id = 10;//can be accessed by inner class
	
	class MyInnerClasss {
		public void display() {
			System.out.println("inner classes"+id);
		}
	}
}

/**
 * @author rs99000
 *
 */
public class StaticInnerClassExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Static class
		MyStaticExampleOuterClass.MyStaticInnerClasss obj = new MyStaticExampleOuterClass.MyStaticInnerClasss();
		obj.displayStatic();
		
		//Inner class
		//MyInnerExampleOuterClass outerExample = new MyInnerExampleOuterClass();
		MyInnerExampleOuterClass.MyInnerClasss innerClass = new MyInnerExampleOuterClass().new MyInnerClasss();
		
		innerClass.display();
		int id = 10;
		class test{
			int id = 10;
			public void test1(){
				System.out.println(id);
			}
			
		}
	}
}