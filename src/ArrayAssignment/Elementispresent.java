package ArrayAssignment;
        //8.How many times a given element is present
public class Elementispresent {
	void element(int a[]) {
		int arr=a[0];
		int pos=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]==arr) {
				pos++;
			}
		}
		System.out.println(pos);
	}
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,1,2,2,1};
		Elementispresent ep=new Elementispresent();
		ep.element(a);

	}

}
