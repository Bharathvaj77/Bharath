package Bharath;

public class prime {
public static void main(String args[]) {
	int num=10,count;
	int i,j;
	for( i=2;i<=20;i++) {
		count=0;
	for( j=1;j<=i;j++) {// 1<=1
	if(i%j==0) {
		count++;
		
	}
	}
	if(count==2) {
		System.out.println(i);
	}
	}
	
	
}
}
