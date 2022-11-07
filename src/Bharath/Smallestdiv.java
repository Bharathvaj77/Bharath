package Bharath;

public class Smallestdiv {
	void small(int n) {
		int div=2;
		while(div<n) {
			if(n%div==0) {
				System.out.println(div + " is a smallest divisor of given number");
				break;
			}
			div=div+1;
		}
	}
	public static void main(String[] args) {
		Smallestdiv sd=new Smallestdiv();
		sd.small(25);
	}

}
