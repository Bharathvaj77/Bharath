package Bharath;

public class A {
	int max (int a,int b,int c) {
		if(a>b && a>c) 
		{
			return a;
			}
		else if(b>c)
		{
			return b;
		}
		else
		{
			return c;
		}
		
	}	

		
				
	public static void main(String[] args) {
		A a1 = new A();
		int m = a1.max(10,5,16);
				System.out.println(m);

	}

}
