package Bharath;

public class Student {
	int rollno;
	String name;
	int mark;
	char grade;
	void setgrade() {
		if(mark>=90) {
			grade = 'A';
		}
		else if(mark>=80) {
			grade = 'B';
		}
		else if(mark>=70) {
			grade = 'c';
		}
		else if(mark>=60) {
			grade = 'D';
		}
		else if(mark>=50) {
			grade = 'E';
		}
		else if(mark<50) {
			grade = 'F';
		}
	}
	public static void main(String[] args) {
		Student s1=new Student();
		s1.rollno=1;
		s1.name="Abdul";
		s1.mark=35;
		s1.setgrade();
		System.out.println(s1.grade);
		
		Student s2=new Student();
		s2.rollno=2;
		s2.name="Bharath";
		s2.mark=97;
		s2.setgrade();
		System.out.println(s2.grade);
		
		Student s3=new Student();
		s3.rollno=3;
		s3.name="Mani";
		s3.mark=80;
		s3.setgrade();
		System.out.println(s3.grade);
		
		Student s4=new Student();
		s4.rollno=4;
		s4.name="Mugil";
		s4.mark=58;
		s4.setgrade();
		System.out.println(s4.grade);
		
		Student s5=new Student();
		s5.rollno=4;
		s5.name="pradeep";
		s5.mark=62;
		s5.setgrade();
		System.out.println(s5.grade);
		
		Student s6=new Student();
		s6.rollno=4;
		s6.name="Suganth";
		s6.mark=37;
		s6.setgrade();
		System.out.println(s6.grade);
	}

}
