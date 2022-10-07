
package Bharath;


public class Vaj {

	
	public static void main(String[] args) {
		int a[]= {210,90,700,10};
		int max=0;
		int max2=0;
		int pos=0;
		int pos2=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
				pos=i;
				
			}
		}
		System.out.println("The maximum number is:" + max);
		System.out.println("The position of maximum number is:" + pos);
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>=max2 && a[i]!=max) 
			{
				max2=a[i];
				pos2=i;
			
			}
		}
		System.out.println("The second maximum number is:" + max2);
		System.out.println("The position of second maximum number is:" + pos2);
	}
}