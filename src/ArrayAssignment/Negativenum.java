package ArrayAssignment;
	//21.finding only negative numbers in a given array
public class Negativenum {
	void negative(int a[]) {
		for(int i=0;i<a.length;i++) {
			if(a[i]<0) {
			System.out.println(a[i]);
		}
		}
	}
	public static void main(String[] args) {
		int a[]= {1,2,-3,4,-5,6,-7};
		Negativenum nn=new Negativenum();
		nn.negative(a);
	}

}
