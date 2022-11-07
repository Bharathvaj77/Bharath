package Bharath;

public class Leastcommonmultiple {
	void least(int n1,int n2) {
		int big=n1>n2 ? n1:n2;
		while(true) {
			if(big%n1==0 && big%n2==0) {
				System.out.println(big);
				break;
			}
			big=big+1;
		}
	}
	public static void main(String[] args) {
		Leastcommonmultiple lcm=new Leastcommonmultiple();
		lcm.least(60,140);
	}

}
