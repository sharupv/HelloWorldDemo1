package cscorner;

public class Unary_operator {

	public static void main(String[] args) {
		//preincrement
		int x=2;
		int p=4;
		int y=++x;
		System.out.print(y);
		//postincrement
		int z=p++;
		System.out.print("\n"+z);
		//predecrement
		int k=--x;
		System.out.println("\n"+k);
		//postdecrement
		int j=p--;
		System.out.println(+j);

	}

}
