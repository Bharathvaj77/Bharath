package Bharath;

public class Mark {
	int m1;
	int m2;
	int m3;
	int m4;
	int m5;
	void cal() {
		int total=m1+m2+m3+m4+m5;
		System.out.println(total);
	}
	public static void main(String[] args) {
		Mark Bharath=new Mark();
		Bharath.m1=83;
		Bharath.m2=86;
		Bharath.m3=89;
		Bharath.m4=92;
		Bharath.m5=95;
		Bharath.cal();
		
		Mark vaj=new Mark();
		vaj.m1=77;
		vaj.m2=87;
		vaj.m3=76;
		vaj.m4=57;
		vaj.m5=86;
		vaj.cal();
		}

}
