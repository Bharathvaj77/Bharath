package Bharath;

public class Largestarray1 {
	
	
	void largest(int a[]) {
		int max=a[0];
		int max2=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				if(max!=max2) {
					max2=max;
					max=a[i];
				}
			}
			System.out.println("The Maximum value of Array is : " + max);
			System.out.println("The second Maximum value of Array is : " + max2);
		}
		
		//System.out.println("The Maximum value of Array is : " + max);
		//System.out.println("The second Maximum value of Array is : " + max2);
	}
	public static void main(String[] args) {
		int a[]= {11,23,43,21,100};
		Largestarray1 la=new Largestarray1();
		la.largest(a);
	}

}
