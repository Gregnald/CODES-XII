import java.io.*;
import java.util.*;
class point
{
	Scanner r = new Scanner (System.in);
	int A[][];
	int R,C;

	point(int p,int q)
	{
		R=p;
		C=q;
		A=new int[R][C];
	}

	void get_array()
	{
		int i,j,k,l;
		System.out.println("Enter array elements :");
		for(i=0;i<R;++i)
		{
			for(j=0;j<C;++j)
			{
				A[i][j]=r.nextInt();
			}
		}
	}

	void display_mat()
	{
		int i,j,k,l;
		System.out.println("Entered Matrix");
		for(i=0;i<R;++i)
		{
			for(j=0;j<C;++j)
			{
				System.out.print(A[i][j]+" ");
			}
			System.out.println();
		}
	}

	int check_pseudo(int a[])
	{
		int i,j;
		int k=0,l,m=1,s=0,ps=0,h,Sum=0;
		h=C/2;
		for(i=0;i<h;++i)
		{
			s=a[i]+a[C-i-1];
			if(m==1){--m;ps=s;continue;}
			if(s!=ps){++k;return 0;}
			ps=s;
		}
		if(k==0)
		{
			for(i=0;i<C;++i)
			{
				Sum+=a[i];
			}
			if(Sum%s==0)return 1;
			return 0;
		}
		return 0;
	}

	void result()
	{
		int i,c;
		for(i=0;i<R;++i)
		{
			c=check_pseudo(A[i]);
			System.out.print("Row "+(i+1)+" -> ");
			if(c==1)System.out.println("pseudo numbers");
			else System.out.println("not pseudo numbers");
		}
	}

	public static void main (String[]args)
	{
		Scanner r = new Scanner (System.in);
		System.out.println("Enter row and column :");
		int ro = r.nextInt();
		int co = r.nextInt();
		point ob = new point(ro,co);
		ob.get_array();
		ob.display_mat();
		ob.result();
	}
}