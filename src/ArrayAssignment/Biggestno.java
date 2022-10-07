package ArrayAssignment;
   //9.Finding Biggest no in given Array
public class Biggestno {
	void largest(int a[]) {
		int max=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		System.out.println("The Biggest no in given Array is "  +  max);
	}
	public static void main(String[] args) {
		int a[]= {10,22,12,43,37};
		Biggestno bn=new Biggestno();
		bn.largest(a);
		

	}

}
