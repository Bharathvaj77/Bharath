package Bharath;

public class Squareroot {
	void square(int n) {
		int div=2;
		while(div<n) {
			if (n/div==div) {
				System.out.println(div + " is a Square root of given number");
				break;
			}
			div=div+1;
		}
	}
	public static void main(String[] args) {
		Squareroot sr=new Squareroot();
		sr.square(100);
	}

}
