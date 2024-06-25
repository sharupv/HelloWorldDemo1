package cscorner;

public class Logical_operators {

	public static void main(String[] args) {
		int x=22;
		int y=2;
		// AND operator
		System.out.println("(x>y)&&(y<x) is "+((x>y)&&(y<x)));
		// OR Operator
		System.out.println("(x>y)||(y>x) is "+((x>y)||(y>x)));
		// NOT operator
		System.out.println("x is greater than y= "+(!(x<y)));

	}

}
