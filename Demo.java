import java.util.*;

class Demo
{
	public static void main(String[] args) 
	{
		Scanner sobj=new Scanner(System.in);

		System.out.println("Enter the size of Array");
		int size=sobj.nextInt();

		int Arr[]=new int[size];
		int i=0,j=0;
		int temp=0;
		System.out.println("Enter the Elements");
		for(i=0;i<Arr.length;i++)
		{
			Arr[i]=sobj.nextInt();
		}

		System.out.println("Elements are:");
		for(i=0;i<Arr.length;i++)
		{
			for(j=0;j<i;j++)
			{
				if(Arr[i]==Arr[j])
				{
					break;
				}
				
			}
			if(i==j)
				{
					System.out.println(Arr[i]+"");
				}
		}
	}
}
