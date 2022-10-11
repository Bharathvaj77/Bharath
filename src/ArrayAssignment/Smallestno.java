package ArrayAssignment;
    //10,12.Finding the first two Smallest no in given Array
public class Smallestno {
	void smallest(int a[]) {
		int min=a[0];
		int min2=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]<min) 
			{
				min2=min;
				min=a[i];
			}
			if(min!=a[i] && a[i]<min2) {
				min2=a[i];
			}
		}
		System.out.println("The Smallest no of given Array is " +min);
		System.out.println("The second Smallest no of given Array is " +min2);
	}
	public static void main(String[] args) {
		int a[]= {24,29,10,34,27};
		Smallestno sn=new Smallestno();
		sn.smallest(a);

	}

}
