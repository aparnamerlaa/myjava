package mypackage;

public class Result extends Addition
{
	void add() 
	{
		super.add(10,20);
		if(c%10==0) 
		{
			System.out.println("completely divisible");	
	}
	
	else
	{
		System.out.println("not divisible");
		
	}
}
public static void main(String args[])
{
	Result ob=new Result();
	ob.add();
}
}