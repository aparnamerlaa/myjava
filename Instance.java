package mypackage;

public class Instance {

	public int add(int x,int y)
	{
		int addition=x+y;
		return addition;
	}
	public static void main(String[] args) 
	{  int n1=10;
	int n2=20;
		Instance ob=new Instance();
		int answer=ob.Instance(n1,n2);
		System.out.println(answer);
		// TODO Auto-generated method stub

	}

}
