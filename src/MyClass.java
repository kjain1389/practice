public class MyClass implements Interface1, Interface2 {

	@Override
	public void method2() {
	}

	@Override
	public void method1(String str) {
	}
	
	public static void main(String[] args) {
		MyClass m = new MyClass();
		
		m.log("abc");
		
	}

/*	//MyClass won't compile without having it's own log() implementation
	@Override
	public void log(String str){
		System.out.println("MyClass logging::"+str);
		Interface1.print("abc");
	}*/
	
}
abstract class ABCD{
	 abstract void test();
	
}
abstract class D extends ABCD{
	@Override
	void test(){
		
	}
}

