package cscorner;

public class MultiDim1 {

	public static void main(String[] args) {
		//first way of initialization//
		int a[][]=new int[2][2];
		a[0][0]=1;
		a[0][1]=2;
		a[1][0]=3;
		a[1][1]=4;
		System.out.print(a[0][1]);
		//second way of initialization//
		int b[][]= {{10,20},{30,40}};
		System.out.print("\n"+ b[0][1]);
		//Normal reading using for loop//
		for(int i=0;i<b.length;i++) {
			for(int j=0;j<b[i].length;j++) {
				System.out.println("\n"+b[i][j]);
			}
		}
		//Enhanced for loop//
		int c[][]= {{50,60},{70,80},{90,100}};
		for (int k[]:c) {
			for(int p:k) {
				System.out.println("\n\n"+p);
			}
		}
		}
		
		

	}

