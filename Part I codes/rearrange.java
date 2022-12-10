import java.io.*;
import java.util.*;
class rearrange
{
	public static void main (String[]args)
	{
		Scanner r = new Scanner (System.in);
		System.out.println("Enter no of rows and columns :");
		int i,j,k,l,A[][],M,N,s[]=new int[3],b[]=new int[3];
		M = r.nextInt();
		N = r.nextInt();
		A=new int[M][N];
		int a[]=new int[M*N],p=0;
		System.out.println("Enter array elements :");
		for(i=0;i<M;++i)
		{
			for(j=0;j<N;++j)
			{
				A[i][j]=r.nextInt();
			}
		}
		s[0]=A[0][0];
		b[0]=A[0][0];
		System.out.println("Original Matrix : ");
		for(i=0;i<M;++i)
		{
			for(j=0;j<N;++j)
			{
				if(A[i][j]<s[0])
				{
					s[0]=A[i][j];
					s[1]=i;
					s[2]=j;
				}
				if(A[i][j]>b[0])
				{
					b[0]=A[i][j];
					b[1]=i;
					b[2]=j;
				}
				System.out.print(A[i][j]+" ");
				a[p]=A[i][j];
				++p;
			}
			System.out.println();
		}
		int t;
		for(i=0;i<(M*/*¶*/N);++i)
		{
			for(j=0;j<((M*N)-1);++j)
			{
			if(a[j]>a[j+1])
			{
				t=a[j];
				a[j]=a[j+1];
				a[j+1]=t;
			}}
		}
		p=0;
		for(i=0;i<M;++i)
 		{
			for(j=0;j<N;++j)
			{
				A[i][j]=a[p];
				++p;
			}
		}
		System.out.println("Largest Number : "+b[0]);
		System.out.println("Row : "+b[1]);
		System.out.println("Column : "+b[2]);
		System.out.println("\nSmallest Number : "+s[0]);
		System.out.println("Row : "+s[1]);
		System.out.println("Column : "+s[2]);

		System.out.println("Rearranged Matrix :");
		for(i=0;i<M;++i)
		{
			for(j=0;j<N;++j)
			{
				System.out.print(A[i][j]+" ");
			}
			System.out.println();
		}
	}
}