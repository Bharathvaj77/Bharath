package Bharath;

public class fibonacciseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=-1;
		int n2=1;
		int n3; 
		for(int i=0;i<7;i++) {
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.println(n3);			
		}
	}

}
