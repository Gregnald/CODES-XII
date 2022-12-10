import java.io.*;
import java.util.*;
class denomination
{
	public static void main (String[]args)
	{
		Scanner r = new Scanner (System.in);
		int i,j,k,l,m,b,val,a[]=new int[9],c[]={1000,500,100,50,20,10,5,2,1};
		String s="",w[]={"ZERO","ONE","TWO","THREE","FOUR","FIVE","SIX","SEVEN","EIGHT","NINE"};
		System.out.print("Enter ammount : ");
		val = r.nextInt();b=val;
		if(b>99999||b==0){System.out.println("INVALID INPUT");return;}
		while(b>0)
		{
			j=b%10;
			b/=10;
			s=w[j]+" "+s;
		}
		System.out.println(s);
		b=val;
		for(i=0;i<9;++i)
		{
			a[i]=b/c[i];
			b=b-(a[i]*c[i]);
		}
		System.out.println("DENOMINATIONS : ");
		for(i=0;i<9;++i)
		{
			if(a[i]==0)continue;
			System.out.println(c[i]+" X "+a[i]+" = "+(a[i]*c[i]));
		}
		System.out.println("TOTAL : "+val);
	}
}