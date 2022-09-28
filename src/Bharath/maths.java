package Bharath;

public class maths {
	int a,b;
	void add() {
		System.out.println(a+b);
	}
	void sub() {
		System.out.println(a-b);
	}
	void mul() {
		System.out.println(a*b);
	}
	void div() {
		System.out.println(a/b);
	}
	public static void main(String[] args) {
		maths m1=new maths();
		m1.a=5;
		m1.b=3;
		m1.add();
		m1.sub();
		m1.mul();
		m1.div();

	}

}
