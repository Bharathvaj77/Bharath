package ArrayAssignment;
    //7.placing a given number in last index of a array
public class placingnumber {
	void place(int a[]) {
		int store=66;
		int pos=a[4];
		for(int i=0;i<a.length;i++) {
			if(a[i]==pos) {
			 System.out.println(store);
			}
			System.out.println(a[i]);
		}
	}
	public static void main(String[] args) {
		int a[]= {10,20,30,44,55};
		placingnumber pn =new placingnumber();
		pn.place(a);

	}

}
