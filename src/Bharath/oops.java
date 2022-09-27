package Bharath;

public class oops {
			int a;
			void area() 
			{
			System.out.println(a*a);
		}
		
	public static void main(String[] args) {
		oops s1=new oops();
		oops s2=new oops();
		s1.a=5;
		s2.a=10;
		s1.area();
		s2.area();
	}

}
