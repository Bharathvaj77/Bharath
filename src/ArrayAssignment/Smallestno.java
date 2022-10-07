package ArrayAssignment;
    //10.Finding the Smallest no in given Array
public class Smallestno {
	void smallest(int a[]) {
		int min=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}
		System.out.println("The Smallest no of given Array is " +min);
	}
	public static void main(String[] args) {
		int a[]= {11,23,10,34,27};
		Smallestno sn=new Smallestno();
		sn.smallest(a);

	}

}
