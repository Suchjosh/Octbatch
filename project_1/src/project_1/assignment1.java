package project_1;

public class assignment1 {

	public int sum(int a, int b)
	{
		int c;
		c=a+b;
		System.out.println("sum result is" +c);
		return c;
	}
	public int sub(int x, int y)
	{
		int z;
		z=x-y;
		System.out.println("sub result is" +z);
		return z;
	}
	public int multi (int m,int n)
	{
		int s;
		s=m*n;
		System.out.println("multiplication result is" +s);
		return s;
	}
	public int div(int x1,int y1)
	{
		int z1;
		z1=x1/y1;
		System.out.println("division result is" +z1);
		return z1;
	}
	public static void main(String[] args) {
		assignment1 ob= new assignment1();
		int sumresult1=ob.sum(10,2);
		int sumresult2=ob.sum(sumresult1, 2);
		int subresult=ob.sub(sumresult2, 2);
		int multiresult=ob.multi(subresult,2);
		int divresult=ob.div(multiresult,2);
		System.out.println("Equation result" +divresult);
		
	}
	
}
