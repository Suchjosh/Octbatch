package project_1;

public class arithmatic {

	public int sum(int a, int b)
	{
		int c;
		c=a+b;
		System.out.println("sum result is"+c);
		return c;
	}
	public int sub(int x,int y)
	{
		int z;
		z=x-y;
		System.out.println("sub result is" +z);
		return z;
	}
	public void multi(int c, int d)
	{
		int result;
		result=c*d;
		System.out.println("result is" +result);
		
	}
	public static void main(String[] args) {
		arithmatic ob=new arithmatic();
		int sumresult=ob.sum(10,2);
		int subresult=ob.sub(12,2);
		ob.multi(sumresult, subresult);
		
	}
}
