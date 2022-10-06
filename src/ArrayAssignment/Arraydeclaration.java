package ArrayAssignment;

public class Arraydeclaration {
	int mark;
	
	void cal()
	{
		int total=mark;
		System.out.println(total);
	}
	public static void main(String[] args) {
		Arraydeclaration Ad =new Arraydeclaration();
		Ad.mark=80;
		Ad.cal();
	}

}
