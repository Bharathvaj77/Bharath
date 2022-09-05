
package Bharath;


public class Vaj {

	
	public static void main(String[] args) {
		int a = -7;
		if ((a%2==0) && (a>=0)) {
			System.out.println("positive even");
		}
		else if ((a%2==0) && (a<=0)){
			System.out.println("negative even");
		}
		else if(!(a%2==0) && (a>=0)) {
			System.out.println("positive odd");
	}
		else if (!(a%2==0) && (a<=0)) {
			System.out.println("negative odd");
}
		else {
			System.out.println("error");
		
		}
	}
}
