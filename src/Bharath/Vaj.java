
package Bharath;


public class Vaj {

	
	public static void main(String[] args) {
		int i = 1;
		while (i<20) {
			if (i%3==0 && i%5==0) {
				System.out.println("Bing Bang");
			}
			if (i%3==0) {
				System.out.println("Bing");
			}
			else if (i%5==0) {
				System.out.println("Bang");
			}
			else if((i%3!=0) && (i%5!=0)) {
				System.out.println(i);
			}
			i++;
		}
		
		
		
		
		
		
		
	}
}