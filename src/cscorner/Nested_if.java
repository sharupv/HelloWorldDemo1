package cscorner;

public class Nested_if {

	public static void main(String[] args) {
		int x=18;
		int y=55;
		if(x==18) {
			if(y>50) {
				System.out.print("you are eligible to donate blood");
			}
			else {
				System.out.println("you are not eligible");
			}
		}
		else {
			System.out.print("come after completing 18 years");
		}

	}

}
