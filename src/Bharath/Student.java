package Bharath;

public class Student {
	int rollno;
	String name;
	int mark;
	void display() {
		System.out.println(rollno);
		System.out.println(name);
		System.out.println(mark);
	}
	public static void main(String[] args) {
		Student s1=new Student();
		s1.rollno=1;
		s1.name="Mugil";
		s1.mark=35;
		s1.display();
		System.out.println();
		
		Student s2=new Student();
		s2.rollno=2;
		s2.name="Bharath";
		s2.mark=97;
		s2.display();

	}

}
