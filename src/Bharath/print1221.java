package Bharath;

public class print1221 {

	public static void main(String[] args) {
		int n=4;
		int i,j;
		for( i=1;i<=3;i++) {
			 for(j=1;j<=n;j++)
				if(j==1 || j==n) {
					System.out.print("1 ");
				}
				else {
					System.out.print("2 ");
				}
			 System.out.println();
		}
		
	}

}
