package project_1;

public class constructor2 {
	
	public void m1()
	{
		this.m4(10,20,30);
		System.out.println("Default method");
		this.m5(11,22,33,44);
		this.m2(100);
		this.m3(40,50);
	}
	public void m2(int a)
	{
		System.out.println("One Parameterized method");
	}
	public void m3(int a,int b)
	{
		System.out.println("Two Parameterized method");
	}
	public void m4(int a,int b,int c)
	{
		System.out.println("Three Parameterized method");
	}
	public void m5(int a,int b,int c,int d)
	{
		System.out.println("Four Parameterized method");
	}
	public static void main(String[] args) {
		constructor2 obj=new constructor2();
		obj.m1();
	}
}
