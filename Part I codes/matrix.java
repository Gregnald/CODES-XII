import java.io.*;
import java.util.*;
class matrix
{
	public static void main (String[]args)
	{
		Scanner r = new Scanner (System.in);
		int N,V,M,O[][],S[][],i,j,k=1,l;
		System.out.print("Enter order of matrix :");
		N = r.nextInt();
		O = new int [N][N];
		for(i=0;i<N;++i)
		{
			for(j=0;j<N;++j)
			{
				O[i][j]=k;
				++k;
			}
		}
		System.out.println("Matrix formed :");
		for(i=0;i<N;++i)
		{
			for(j=0;j<N;++j)
			{
				System.out.print(O[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Enter V and M :");
		V = r/*¶*/.nextInt();
		M = r.nextInt();
		int ki,kj,ni,nj;ni=nj=ki=kj=0;
		S=new int [M][M];
		for(i=0;i<N;++i)
		{
			for(j=0;j<N;++j)
			{
				if(O[i][j]==V){ki=i;kj=j;break;}
			}
		}

		for(i=0;i<M;++i)
		{
			for(j=0;j<M;++j)
			{
				ni=i+ki;
				nj=j+kj;
				if(ni>=N)ni=(ni-(N*(ni/N)));
				if(nj>=N)nj=(nj-(N*(nj/N)));
				S[i][j]=O[ni][nj];
			}
		}
		System.out.println("\nSub Matrix:\n");
		for(i=0;i<M;++i)
		{
			for(j=0;j<M;++j)
			{
				System.out.print(S[i][j]+"\t");
			}
			System.out.println();
		}
	}
}