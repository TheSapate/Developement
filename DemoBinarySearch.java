//BinarySearch.java

import java.util.*;

class Searching
{
	public boolean BinarySearch(int Arr[],int no)
	{
		int start,end,mid;
		start=0;
		end=Arr.length-1;
		mid=(start+end)/2;

		while(start<=end)
		{
			if(Arr[mid]==no)
			{
				break;
			}
			else if(no>Arr[mid])
			{
				start=mid+1;
			}
			else if(no<Arr[mid])
			{
				end=mid-1;
			}
			mid=(start+end)/2;
		}
		if(Arr[mid]==no)
        {
        	return true;
        }
        else
        {
        	return false;
        }
	}
}

class DemoBinarySearch
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
		boolean bret=obj.BinarySearch(Arr,iValue);

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