package old;

public class Sample2 
{
	 static int a;
	static int b;
	static int c;
	int f;
Sample2(int a,int b)
{
	this.a=a;
	this.b=b;
	c=a+b;
	System.out.println(c);
}
 int add()
{
	c=a+b;
	return c;
}
static int sub()
{
	
}

	public static void main(String[] args)
	{
		Sample2 ob=new Sample2(10,20);
		sub();
		ob.add();
		// TODO Auto-generated method stub

	}

}
