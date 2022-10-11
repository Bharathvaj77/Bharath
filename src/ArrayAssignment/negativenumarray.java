package ArrayAssignment;
     //22.copying only the negative numbers in a given array to another array
public class negativenumarray {
	int b[]=new int[10];
	void negative(int a[]) {
		for(int i=0;i<a.length;i++) {
			if(a[i]<0) {
				b[i]=a[i];
				System.out.println(b[i]);
			}
		}
	}
	public static void main(String[] args) {
		int a[]= {1,2,3,-4,-5,6,-7};
		negativenumarray nna=new negativenumarray();
		nna.negative(a);
	}

}
