package Interface;
interface sum
	{
		int sm=25;
		void suma();
	}
	interface add
	{
	int ad=19;
	void adda();
	}
class A1 implements add,sum
{
	public void suma()
	{
		System.out.println(+sm);
	}
public void adda()
{
	System.out.println(+ad);
}
public static void main(String arr[])
{
	A1 n=new A1();
	n.adda();
	n.suma();
}
}


