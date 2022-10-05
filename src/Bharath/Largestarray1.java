package Bharath;

public class Largestarray1 {
	
	int max=0;
	int largest(int a[]) {
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		return max;
	}
	public static void main(String[] args) {
		int a[]= {10,20,30,40,50};
		Largestarray1 la=new Largestarray1();
		int store =la.largest(a);
		System.out.println(store);
	}

}
