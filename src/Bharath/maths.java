package Bharath;

public class maths {
	int sum;
	void factorial() {
	for(int i=1;i<=5;i++) {
		sum=sum*i;
		System.out.println(sum);
	}
	}
	public static void main(String[] args) {
		maths fac=new maths();
		fac.sum=1;
		fac.factorial();
	

}
}