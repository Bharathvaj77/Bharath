
package Bharath;


public class Vaj {

	
	public static void main(String[] args) {
		int i,m=0, a=0;
		int n = 7;
		m = n/2;
		if(n==0 || n==1) {
			System.out.println(n +  "is not a prime number");}
		else {
			for(i=2;i<=m;i++) {
				if (n%i==0) {
					System.out.println(n +  "is not a prime number");
					a=1;
				}
			}
		}
		if(a==0) {
			System.out.println(n +  "is a prime number");
		}
		
			
		
		
		
		
		
	}
}