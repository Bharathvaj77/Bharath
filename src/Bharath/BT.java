package Bharath;

public class BT {

	public static void main(String[] args) {
		int n1 = 0, n2 =1, n3, sum= 0;
		for (int i =0; i<=10;i++) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			sum = sum + n3;
			System.out.println(sum);
		}
			
		
	}

}
