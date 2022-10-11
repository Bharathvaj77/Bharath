package ArrayAssignment;
        //24.printing values b/w adjacent two elements in a given array
public class Adjacent {
	int arr[]=new int[5];
	int sum=0;
	void arr(int a[]) {
		for(int i=0;i<a.length-1;i++)
		{	 
				sum=a[i]-a[i+1];
				arr[i]=sum;
			
			System.out.println(-arr[i]);
		}
	}
	
	public static void main(String[] args) {
		int a[]= {10,20,35,40,50};
		Adjacent aj=new Adjacent();
		aj.arr(a);
		
	}

}
