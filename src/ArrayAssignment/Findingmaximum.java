package ArrayAssignment;

public class Findingmaximum {
	
	void max(int a[]) {
		int max=0;
		for(int i=0;i<=a.length-1;i++) {
			if(a[i]>max) {
				max = a[i];
			}
		}
		System.out.println(max);
	}
		
	public static void main(String[] args) {
		int a[]= {11,23,4,5,13};
		Findingmaximum fm=new Findingmaximum();
		fm.max(a);
	}

}
