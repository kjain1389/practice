/**
 * 
 */
package inheritance;

class MyStaticClassParent {
	public static void display() {
		System.out.println("I am Parent class");
	}
}

class MyStaticClassChild extends MyStaticClassParent {
	public static void display() {
		System.out.println("I am Child class");
	}
}

/**
 * @author rs99000
 *
 */
public class StaticMethodHiding {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		MyStaticClassParent parent = new MyStaticClassChild();
		parent.display();
		MyStaticClassChild child = new MyStaticClassChild();
		child.display();

	}
}
