
class A {
	private String name;

	public A() {
		System.out.println("===A()===");
	}

	public A(String name) {
		System.out.println("===A(name)===");
		this.name = name;
	}

	@Override
	public String toString() {
		return "A [name=" + name + "]";
	}

	public A toCheckClone(A a) throws CloneNotSupportedException {
		return (A) a.clone(); // will throw java.lang.CloneNotSupportedException
								// - Runtime
	}

}

class B extends A implements Cloneable {
	public String name;

	public B() {
		System.out.println("===B()===");
	}

	public B(String name) {
		System.out.println("===B(name)===");
		this.name = name;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {

		return super.clone();
	}

	@Override
	public String toString() {
		return "B [name=" + name + "]";
	}
}

class A1 implements Cloneable {
	// member attributes and methods
}

/*
 * class B1 { 
 *	 A1 a = new A1(); //Syntax error on token ";", { expected after
 * 	 //this token 
 *  if(a instanceof Cloneable) { //I should be able to do this; But I
 * 	//am not. 
 *  A1 copied = a.clone(); //The method clone() from the type Object is
 * 	//not visible.
 * 
 * 	//Because cloning can cause problems, clone( ) is declared as protected
 * 	//inside Object. 
 * } 
 *}
 */

class TestClone implements Cloneable {
	int a;
	double b;
	public TestClone(){
		System.out.println("TestClone constructor...!!!");
		a=10;
		b=15;
	}
	// This method calls Object's clone().
	public TestClone cloneTest() {
		try {
			// call clone in Object.
			return (TestClone) super.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println("Cloning not allowed.");
			return this;
		}
	}
	
}

public class SubclassCloneTest {

	public static void main(String[] args) throws CloneNotSupportedException {

		B b = new B("sub class");
		System.out.println("original B = " + b);
		System.out.println("clone calling");
		B clonedB = (B) b.clone();
		// [IMP]- clone() method does not call any constructor for creating the
		// new instance.
		System.out.println("cloned B = " + clonedB);
		
		if(b==clonedB){
			System.out.println("b==clonedB is true");
		}
		
		if(b.equals(clonedB)){
			System.out.println("b.equals(clonedB) is true");
		}
		
		
		//Very imp concept please check output.
		clonedB.name ="Aditya";
		System.out.println("b name is - "+b.name);  
		
		b.name ="Aditya";
		System.out.println("clonedB name is - "+clonedB.name);
		
		
		
		
		A a = new A();
		// A ab = (A) a.clone(); //The method clone() from the type Object is
		// not visible

		/*
		 * A ab = a.toCheckClone(a); //Throw runtime CloneNotSupportedException
		 * System.out.println(ab);
		 */
		
		TestClone tc = new TestClone();
		System.out.println("TC 1 of a+b ="+tc.a+tc.b);  // why 1015.0 ? [socho ;-) ]
		
		TestClone tc2 = tc.cloneTest();
		System.out.println("TC 2 a+b ="+tc2.a+tc2.b);
		
				
		if(tc==tc2){
			System.out.println("tc==tc2 is true");
		}
		
		if(tc.equals(tc2)){
			System.out.println("tc.equals(tc2) is true");
		}
		
		
		tc2.a=6;
		
		System.out.println("TC 1 of a+b ="+tc.a+tc.b);
		
		
		System.out.println("!!!!!  The End  !!!!!!");
	}

}