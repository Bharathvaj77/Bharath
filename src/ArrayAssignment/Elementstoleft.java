package ArrayAssignment;
      //15.16.Moving all elements towards left in a given array && moving twice towards left
public class Elementstoleft {
	void movingleft(int a[]) {
		int b=a[4];
		for(int i=a.length-1;i>0;i--) {
			a[i]=a[i-1];
		}
		a[0]=b;
		
	}
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		Elementstoleft el=new Elementstoleft();
		el.movingleft(a);
		el.movingleft(a);
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		
		
	}

}
