package Bharath;

public class lastnumswap {

	public static void main(String[] args) {
		int a[]= {1,2,3,7,6};
		int b=a[4];
		for(int i=a.length-1;i>0;i--) {
			a[i]=a[i-1];
		}
		a[0]=b;
		for(int i=0;i<=a.length-1;i++) {
			System.out.println(a[i]);
		}
	}

}
