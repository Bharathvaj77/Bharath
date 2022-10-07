package ArrayAssignment;

public class Elementispresent {
	void element(int a[]) {
		//int b=0;
		int pos=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]==pos) {
				pos++;
			}
		}
		
	}
	public static void main(String[] args) {
		int a[]= {1,2,3,4,2,5,2};
		Elementispresent ep=new Elementispresent();
		ep.element(a);

	}

}
