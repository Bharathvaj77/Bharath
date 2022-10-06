package ArrayAssignment;

public class Findingindex {
	void index(int a[]) {
		int n=50;
	
	for(int i=0;i<a.length;i++)
	{
		if(a[i]==n) {
			System.out.println(i);
		}
	}
	}
	public static void main(String[] args) {
		int a[]= {10,20,30,40,50};
		Findingindex Fi=new Findingindex();
		Fi.index(a);
	}

}
