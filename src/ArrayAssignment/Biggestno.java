package ArrayAssignment;
   //9,11.Finding  first two Biggest no in given Array
public class Biggestno {
	void largest(int a[]) {
		int max=0;
		int max2=0;
		for(int i=0;i<a.length;i++) 
		{
			if(a[i]>max) 
			{
				max2=max;
				max=a[i];
			}
			if(max!=a[i] && a[i]>max2) 
			{
				max2=a[i];
			}
		}
		System.out.println("The Biggest no in given Array is "  +  max);
		System.out.println("The second biggest no in a given array is " + max2);
	}
	public static void main(String[] args) {
		int a[]= {10,22,12,43,37};
		Biggestno bn=new Biggestno();
		bn.largest(a);
		

	}

}
