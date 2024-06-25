package cscorner;

public class Bitwise_operator {

	public static void main(String[] args) {
		//AND
		int x=11;
		int y=8;
		System.out.println(x&y);
		//OR
		System.out.println(x|y);
		//XOR
		System.out.println(x^y);
		//rightshift
		System.out.print((x>>y));
		//leftshift
		System.out.print("\n"+(x<<y));
		//compliment operator
		System.out.println("\n"+(~x));
		//conditional operator
		String result=x%2==0?"+even":"odd";
		System.out.println(result);
	}

}
