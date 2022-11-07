package Bharath;

public class Palindrome {
     void pal(int n1) {
    	 int n2=n1;
    	 int rev=0;
    	 while(n1>0) {
    		 int rem=n1%10;
    		 rev=(rev*10)+rem;
    		 n1=n1/10;
    	 }
    	// System.out.println(rev);
    	 
    	 if(n2==rev) {
    		 System.out.println(n2+" is a PALINDROME");}
    		 else {
    			 System.out.println(n2 + " is not a PALINDROME");
    		 }
    	 }
    	 
     
	public static void main(String[] args) {
		Palindrome p=new Palindrome();
		p.pal(12322);

	}

}
