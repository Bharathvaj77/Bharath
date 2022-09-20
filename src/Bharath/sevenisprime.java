package Bharath;

public class sevenisprime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=7;
		int c=0;
		for(int i=2;i<=a;i++) {
			if(a%i==0) {
				c=c+1;
			}
		}
				if(c>2) {
					System.out.println("not a prime");
				}
				else {
					System.out.println("prime");
				}
				
			
		

	}

}
