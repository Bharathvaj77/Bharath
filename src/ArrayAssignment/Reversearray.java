package ArrayAssignment;
       //19.copying the given array to another array in a reverse order
public class Reversearray {
	int b[]=new int[5];
	void reverse(int a[]) {
		for(int i=a.length-1;i>=0;i--) {
			b[i]=a[i];
			System.out.println(b[i]);
		}
	}
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		Reversearray ra=new Reversearray();
		ra.reverse(a);

	}

}
