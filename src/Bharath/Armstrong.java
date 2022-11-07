package Bharath;
       //sum of digits to the power (3) equals to the number itself
public class Armstrong {
	void arms(int n1) {
		int armstrong=0;
		int n2=n1;
		while(n1>0) {
			int rem=n1%10;
			int power=rem*rem*rem;
			armstrong=armstrong+power;
			n1=n1/10;
		}
		if(n2==armstrong) {
			System.out.println(armstrong);
		}
		else {
			System.out.println("Not a Armstrong");
		}
	}
	public static void main(String[] args) {
		Armstrong a=new Armstrong();
		a.arms(152);
	}

}
