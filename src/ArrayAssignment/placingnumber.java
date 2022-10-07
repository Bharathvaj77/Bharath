package ArrayAssignment;

public class placingnumber {
	void place(int a[]) {
		int n=6;
		for(int i=0;i<=n+1;i++) {
			if(a[i]==n+1) {
				
			}
			System.out.println(a[i]);
		}
	}
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		placingnumber pn =new placingnumber();
		pn.place(a);

	}

}
