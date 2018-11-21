
public class Fibo {

	public static void main(String[] args) {
		for(int i=0;i<=10;i++){
			int fibo = getFibo(i);
			System.out.print(fibo+" ");
		}
	}

	private static int getFibo(int i) {
		if(i==0){
			return 0;
		}
		if(i==1 || i ==2){
			return 1;
		}
		
		int fibo1 = 1;
		int fibo2 = 1;
		int fiboNaci = 1;
		for(int n =3;n<=i;n++){
			fibo1 = fibo2;
			fibo2 = fiboNaci;
			fiboNaci = fibo1+fibo2;
		}
		return fiboNaci;
	}
	
	
}
