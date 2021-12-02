import java.util.*;

class Searching
{
	public boolean LinearSearch(int Arr[],int no)
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
		else{
			return true;
		}
	}
}
class DemoLinearSearch
{
	public static void main(String[] args) 
	{
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int size=sobj.nextInt();

		int Arr[]=new int[size];

		System.out.println("Enter the Elements");
		for(int i=0;i<Arr.length;i++)
		{
			Arr[i]=sobj.nextInt();
		}

		System.out.println("Enter the Element to Search:");
		int iValue=sobj.nextInt();

		Searching obj=new Searching();
		boolean bret=obj.LinearSearch(Arr,iValue);

		if(bret==true)
		{
			System.out.println("Element is there");
		}
		else
		{
			System.out.println("Element is not there");
		}
	}
}