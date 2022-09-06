
package Bharath;


public class Vaj {

	
	public static void main(String[] args) {
		int num = 9876 ,sum=0;
		while (num>0) {
			int r = num%10;
			sum = sum+r;
			System.out.println(sum);
			num = num/10;
		}
		
		
	}
}