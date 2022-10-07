package ArrayAssignment;
    //6.Removing given no in a Array
public class Removingnumber {
	void remove(int a[]) {
		int n=5;
		int i=0;
		
		for( i=0;i<a.length;i++) {
			if(a[i]==n) {
				continue;
			}
				System.out.println(a[i]);
			
		}
		
	}
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		Removingnumber rn=new Removingnumber();
		rn.remove(a);
	}

}
