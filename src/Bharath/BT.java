package Bharath;

public class BT {

	public static void main(String[] args) {
		int n = 15;
		int count = 0;
		int i = 2;
		boolean flag = false;
		while(i<=n/2) {
			if (n%i==0) {
				count++;
			}
			if(count>0) {
				flag=true;
				break;
			}
			i++;
		}
		if(flag==true) {
			System.out.println("not a prime");
		}
		else {
			System.out.println("prime");
		}
	}

}
