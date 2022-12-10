import java.io.*;
import java.util.*;
class Set
{
	Scanner r = new Scanner (System.in);
	int arr[],n;
	Set()
	{
		n=0;
	}

	Set(int nn)
	{
		n=nn;
		arr=new int[n];
	}

	void readList()
	{
		System.out.println("\nEnter elements of set : ");
		for(int i=0;i<n;++i)
		{
			arr[i] = r.nextInt();
		}
	}

	int isSet(Set s)
	{
		int c=0,i,j,k,l;
		for(i=0;i<s.n;++i)
		{
			for(j=(i+1);j<s.n;++j)
			{
				if(s.arr[i]==s.arr[j])c=1;
			}
		}
		return c;
	}

	Set intersection(Set s1,Set s2)
	{
		Set moi =new Set((s1.n*s2.n)+1);
		int k=1,i,j,l,f=0;
		for(i=0;i<s1.n;++i)
		{
			for(j=0;j<s2.n;++j)
			{
				if(s1.arr[i]==s2.arr[j]){moi.arr[0]=++f;moi.arr[k]=s1.arr[i];++k;}
			}
		}
		return moi;
	}
	void display()
	{
		int i,j,k,l,m;
		System.out.println("\nEnter size of Set 1 and 2 :");
		int si1 = r.nextInt();
		int si2 = r.nextInt();
		Set S1 = new Set (si1);
		Set S2 = new Set (si2);
		S1.readList();
		S2.readList();
		if (isSet(S1)==0 && isSet(S2)==0)
		{
			Set toi = new Set ();
			toi=intersection(S1,S2);
			if(toi.arr[0]!=0)
			{
				System.out.println("\nIntersection Elements :");
				for(i=1;i<=toi.arr[0];++i)
				{
					System.out.println(toi.arr[i]);
				}
			}
			else System.out.println("\nNo Intersection Element");
		}
		else System.out.println("\nMultiset");
	}

	public static void main (String[]args)
	{
		Scanner r = new Scanner (System.in);
		Set ob = new Set ();
		ob.display();
	}
}