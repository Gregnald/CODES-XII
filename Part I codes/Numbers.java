import java.io.*;
import java.util.*;
class Numbers
{
	int N,Num,Prev,Arr[][];
	Scanner r = new Scanner (System.in);

	Numbers(int a,int b)
	{
		N=a;
		Num=b;
		Arr=new int[N][N];
	}
	Numbers check(int n)
	{
		Numbers o1 = new Numbers(N,Num);
		o1.Prev=Num;--n;int k=0,i=1;
		do
		{
			++n;k=0;i=1;
			while(k<n)
			{
				k+=i;
				++i;
			}
			if(k==n){o1.Num=n;break;}
		}while(1<2);
		return o1;
	}

	void display()
	{
		Numbers o2 = new Numbers(N,Num);
		int i,j/*¶*/,l,m;Prev=Num;
		for(i=0;i<N;++i)
		{
			for(j=0;j<N;++j)
			{
				if(i==0||i==(N-1)||j==0||j==(N-1))
				{
					if(Prev==Num){Arr[i][j]=Prev;++Num;}
					else
					{
						o2=check(Num);
						Num=o2.Num;
						Prev=o2.Prev-1;
						Arr[i][j]=Num;
						++Num;
						if(i==j && j==(N-1))--Num;
					}
				}
			}
		}
		for(i=0;i<N;++i)
		{
			for(j=0;j<N;++j)
			{
				System.out.print("\t"+Arr[i][j]);
			}
			System.out.println();
		}
	}


	public static void main (String[]args)
	{
		Scanner r = new Scanner (System.in);
		System.out.println("Enter order of matrix and triangle no. :");
		int p = r.nextInt(),q = r.nextInt();
		Numbers ob = new Numbers(p,q);
		ob.display();
	}
}