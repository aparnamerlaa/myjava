package mypackage;

class Calculation
{
	int c;
	int a;
	int b;
	int d;
	Calculation(int a,int b)
	{
		this.a=a;
		this.b=b;
		
	}
	public int add()
	{
	c=a+b;
	return c;
	}
	public int sub()
	{
		d=a-b;
	    return d;
	}

	public static void main(String args[])
	{
		Calculation ob=new Calculation(30,20);
		Calculation ob1=new Calculation(100,200);
		Calculation ob2=new Calculation(11,7);
		Calculation ob3=new Calculation(100,20);
		Calculation ob4=new Calculation(50,20);
		int result=ob.add();
		int result1=ob1.add();
		int result2=ob2.add();
		int result3=ob3.add();
		int result4=ob4.add();
		int ans=ob.sub();
		int ans1=ob1.sub();
		int ans2=ob2.sub();
		int ans3=ob3.sub();
		int ans4=ob4.sub();
		System.out.println(result);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		System.out.println(ans);
		System.out.println(ans1);
		System.out.println(ans2);
		System.out.println(ans3);
		System.out.println(ans4);
		

	}

}
