package Bharath;

public class Ebcalculator {

	public static void main(String[] args) {
		int unit=550;
		int t=100;
		int f=300;
		double cost=0;
		if(unit<=100) {
			cost=unit*100;
			System.out.println(cost);
		}
		else if(unit<=200) {
			unit=unit-100;
			cost=unit*1.5;
			System.out.println(cost);
		}
		else if(unit<=500) {
			unit=unit-200;
			cost=((t*2)+(unit*3));
					System.out.println(cost);
		}
		else if(unit>500) {
			unit=unit-500;
			cost=((t*3.5)+(f*4.6)+(unit*6.6));
			System.out.println(cost);
		}
	}

}
