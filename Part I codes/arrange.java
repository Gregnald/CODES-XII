import java.io.*;
import java.util.*;
class arrange
{
	Scanner r = new Scanner (System.in);
	int arr[],size;
	arrange(int n)
	{
		size=n;
		arr=new int[size];
	}

	void input()
	{
		int i,j,k;
		System.out.println("Enter elements : ");
		for(i=0;i<size;++i)
		{
			arr[i] = r.nextInt();
		}
	}

	void arrange()
	{
		int i=0,j=0,k,t,l,m,a[]=new int[size];
		for(i=0;i<size;++i)
		{
			a[i]=arr[i];
		}
		for(i=0;i<size;++i)
		{
			for(j=0;j<(size-1);++j)
			{
				if(a[j]>a[j+1])
				{
					t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
				}
			}
		}
		l=size/2;m=1;
		arr[l]=a[0];
		for(i=1;i<=l;++i)
		{
			arr[l-i]=a[m];m++;
			arr[l+i]=a[m];
			m++;
		}
	}

	void display()
	{
		int i;
		System.out.println("Before Array :\n");
		for(i=0;i<size;++i)System.out.print(arr[i]+",");
		arrange();
		System.out.println("\n\nFinal Array :");
		for(i=0;i<size;++i)System.out.print(arr[i]+",");
		System.out.println("\n");
	}
	public static void main (String[]args)
	{
		Scanner r = new Scanner (System.in);
		System.out.print("Enter Array size : ");
		int p = r.nextInt();
		arrange ob = new arrange(p);
		ob.input();
		ob.display();
	}
}