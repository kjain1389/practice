
public class SwapNUmberWithoutTemp {
	public static void main(String[] args) {
		int x = 5; 
		int y = 6;
		
		x = x+y;
		y = x-y;
		x = x-y;
		System.out.println("x--"+x);
		System.out.println("y--"+y);
	}
}
