import java.io.*;
import java.util.*;
class point2
{
	int a[][],R,C,ps,i,j,s[]=new int[3];

	Scanner r = new Scanner (System.in);
	point2(int f,int g)
	{
		R=f;
		C=g;
		a=new int[R][C];
	}
	void get_array()
	{
		System.out.println("Enter elements :");
		for(i=0;i<R;++i)
		{
			for(j=0;j<C;++j)
			{
				a[i][j] = r.nextInt();
			}
		}
	}

	void display_mat()
	{
		System.out.println("Entered Matrix :");
		for(i=0;i<R;++i)
		{
			for(j=0;j<C;++j)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

	void check_saddle()
	{
		int b=0,c=0,k=0;
		for(i=0;i<R;++i)
		{
			for(j=0;j<C;++j)
			{
				if(j==0){ps=a[i][j];s[0]=a[i][j];s[1]=i;s[2]=j;continue;}
				if(a[i][j]<ps){ps=a[i][j];s[0]=a[i][j];s[1]=i;s[2]=j;}
			}
			k=0;c=0;
			while(k<R)
			{
				if(a[k][s[1]]>s[0]){++c;break;}
				++k;
			}
			if(c==0){b=1;
			System.out.println("saddle point is "+s[0]+" (row = "+s[1]+" and cloumn = "+s[2]+")");}
		}
		if(b==0)System.out.println("No saddle point");
	}

	public static void main (String[]args)
	{
		Scanner r = new Scanner (System.in);
		System.out.println("Enter order of matrix :");
		int t = r.nextInt();
		int y = r.nextInt();
		point2 ob = new point2(t,y);
		ob.get_array();
		ob.display_mat();
		ob.check_saddle();
	}
}