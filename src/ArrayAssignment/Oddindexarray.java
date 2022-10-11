package ArrayAssignment;
    //23.copying only the odd index numbers in given array to another array
public class Oddindexarray {
	int b[]=new int[10];
	void odd(int a[]) {
		int sum=0;
		for(int i=0;i<a.length;i++) {
			if(i%2!=0) {  
				sum=sum+a[i];
				b[i]=a[i];
			}
		}
		System.out.println(sum);
	}
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6};
		Oddindexarray oia=new Oddindexarray();
		oia.odd(a);
	}

}
