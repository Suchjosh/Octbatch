package project_1;

public class student 
{

	int roll_no;
	int age;
	
	public void display1() //method name display
	{
		System.out.println("welcome to all of you");
	}
	public void display2()
	{
		System.out.println("automation is very easy");
	}
	public static void main(String[] args)
	{
		student stu1=new student();
		stu1.roll_no=23;
		System.out.println(stu1.roll_no);
		stu1.age=30;
		System.out.println(stu1.age);
		stu1.display1();
		stu1.display2();
	}
}
