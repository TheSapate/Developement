import java.util.*;

abstract class ArrayX
{
	public int Arr[];

	public ArrayX(int size)
	{
		Arr=new int[size];
	}

	public void Accept()
	{
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter the Elements");
		for(int i=0;i<Arr.length;i++)
		{
			Arr[i]=sobj.nextInt();
		}
	}
	public void Display()
	{
		System.out.println("Entered Data is:");

		for(int i=0;i<Arr.length;i++)
		{
			System.out.println(Arr[i]);
		}
	}
	public abstract boolean search(int no);
}

class Searching extends ArrayX
{
	public Searching(int size)
	{
		super(size);
	}
	public  boolean search(int no)
	{
		int i=0;
		for(i=0;i<Arr.length;i++)
		{
			if(Arr[i]==no)
			{
				break;
			}
		}
		if(i==Arr.length)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
}
class OOPArray1
{
	public static void main(String[] args) 
	{
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int size=sobj.nextInt();

		Searching obj1=new Searching(size);

		obj1.Accept();
		obj1.Display();

		System.out.println("Enter the Element to Search");
		int no=sobj.nextInt();

		boolean bret=obj1.search(no);

		if(bret==true)
		{
			System.out.println("Element is there");
		}
		else
		{
			System.out.println("Element is not there");
		}
		//ArrayX obj=new ArrayX(size);

	}
}