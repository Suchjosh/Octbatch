package project_1;

public class assignment2 {
	
	public int multi(int a, int b)
	{
		int c;
		c=a*b;
		System.out.println("Multiplication result is" +c);
		return c;
	}
	public int sum(int x, int y)
	{
		int z;
		z=x+y;
		System.out.println("Sum result is" +z);
		return z;
	}
	public int sub(int c,int d)
	{
		int e;
		e=c-d;
		System.out.println("Sub result is" +e);
		return e;
	}
	public int div(int m, int n)
	{
		int s;
		s=m/n;
		System.out.println("Division result is" +s);
		return s;
	}
	public static void main(String[] args) 
	{
		assignment2 obj=new assignment2();
		int multresult=obj.multi(10, 2);
		int sumresult=obj.sum(multresult,2);
		int subresult=obj.sub(sumresult, 2);
		int subresult2=obj.sub(subresult,2);
		int divresult=obj.div(sumresult, 2);
		System.out.println("Equation result is" +divresult);
		
	}

}
