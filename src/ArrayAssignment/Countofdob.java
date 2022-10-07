package ArrayAssignment;
     //13.Finding count of dob elements in a given array
public class Countofdob {
	void duplicate(int a[])
	{
	int count=-1;
	for(int i=0;i<a.length;i++)
	{
		if(a[i]==a[1]) {
			count++;
		}
	}
	System.out.println(count);
}
	public static void main(String[] args) 
	{
		int a[]= {1,2,3,4,2,3,2};
		Countofdob cd=new Countofdob();
		cd.duplicate(a);
	}

}
