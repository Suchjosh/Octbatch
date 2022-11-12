package project_1;

public class constructor {
	
	public constructor()
	{
		this(10,20,30,40);//control will go to 4 param constructor
		System.out.println("Default constructor");
	}
	public constructor(int a)
	{
		this();
		System.out.println("one parametarized constructor");
	}
	public constructor(int a,int b)
	{
		this(10,20,30);
		System.out.println("Two Parametarized constructor");
	}
	public constructor(int a,int b,int c)
	{
		this(10);
		System.out.println("Three Parameterized constructor");
	}
	public constructor(int a,int b,int c,int d)
	{
		System.out.println("Four Parameterized constructor");
	}
	
public static void main(String[] args) {
	constructor obj=new constructor(10,20);
}
}
