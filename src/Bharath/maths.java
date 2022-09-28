package Bharath;

public class maths {
	int sum=1 ,n;
	void factorial() {
	for(int i=1;i<=n;i++) {
		sum=sum*i;
	}
		System.out.println(sum);
	}
	public static void main(String[] args) {
		maths fac=new maths();
		fac.n=5;
		fac.factorial();
		maths fac1=new maths();
		fac1.n=6;
		fac1.factorial();

}
}