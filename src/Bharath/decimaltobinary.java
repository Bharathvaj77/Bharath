package Bharath;

public class decimaltobinary {

	public static void main(String[] args) {
		int a=99, i=0;
		int b[] =new int[10]; 
		while(a>0) {
			b[i]=a%2;
		System.out.println(b[i]);
			a=a/2;
			i++;

	}
		System.out.println();
	for(int j=i-1;j>=0;j--) {
		System.out.println(b[j]);
	}

}
}