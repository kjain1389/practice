
public class Lambda {
	public static void main(String[] args) {
		Runnable r1 = () -> {
			System.out.println("1");
		};
		
		
		Runnable r2 = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("2");
				
			}
		};
		
		
		Thread t1 = new Thread(r1);
		t1.start();
		 t1 = new Thread(r2);
		t1.start();
		
		
		Interface1 i1 = (s) -> System.out.println("I Test=========="+s);
		i1.method1("123");
	}
	
	
}
