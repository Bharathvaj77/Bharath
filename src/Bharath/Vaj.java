
package Bharath;


public class Vaj {

	
	public static void main(String[] args) {
		int a[]= {3,4,6,8,10,12};
		int max=a[0];
		int pos=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
				pos=i;
				
			}
			//System.out.print(max);
			//System.out.print(pos);
		}
		System.out.println(max);
		System.out.println(pos);
	}
}