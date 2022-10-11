package ArrayAssignment;
     //17,18.Moving all elements towards right (twice) in a given array
public class Elementstoright {
	 void movingright(int a[]) {
		 int b=a[0];
		 for(int i=0;i<a.length-1;i++) {
			 a[i]=a[i+1];
		 }
		 a[4]=b;
	 }
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		Elementstoright er=new Elementstoright();
		er.movingright(a);
		er.movingright(a);
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}

}
