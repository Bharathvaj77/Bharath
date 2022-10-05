package Bharath;

public class prime {
public static void main(String args[]) {
	int num=20,count;
	int i,j;
	for( i=1;i<=num;i++) {
		count=0;	
	for( j=1;j<=i;j++) {// 1<=1
	if(i%j==0) {
		count++;
		
	}
	}
	if(count<=2) {
		System.out.println(i);
	}
	}
	
	
}
}
