package Bharath;

public class nestedloop {

	public static void main(String[] args) {
		int n=5;
		for(int i=0;i<3;i++) {
			if(i>0) {
				System.out.print(" 1");
				i++;
			}
			for(int j=0;j<3;j++) {
				if(j>0) {
					System.out.print(" 2");
				}
				
				//System.out.print("*");
			}
			System.out.println();
		}
		

		
	}

}
