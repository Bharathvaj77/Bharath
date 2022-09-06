
package Bharath;


public class Vaj {

	
	public static void main(String[] args) {
		int n = 15;
		if (n%3==0 && n%5==0) {
			System.out.println("bing bang");
		}
		else if (n%3==0) {
			System.out.println("bing");
		}
		else if (n%5==0) {
			System.out.println("bang");
		}
		else {
			System.out.println("n");
		}
	}
}