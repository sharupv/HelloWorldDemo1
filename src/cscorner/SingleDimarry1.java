package cscorner;

public class SingleDimarry1 {

	public static void main(String[] args) {
		int a[]=new int[5];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
System.out.println(a[0]);
//another way of initializing array//
int r[] = {2, 3,4};
for(int i =0; i<r.length;i++)
{
System.out.print(r[i]+" ");
}
//read value using enhanced for loop or advanced for loop //
int p[]= {5,6,7};
for(int i:p) {
	System.out.println("\n"+i);
}

	}

}
