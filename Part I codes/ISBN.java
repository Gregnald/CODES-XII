import java.io.*;
import java.util.*;
class ISBN
{
	public static void main (String[]args)
	{
		Scanner r = new Scanner (System.in);
		System.out.print("Enter an ISBN no. ");
		String s=r.nextLine(),p="";
		int i=0,j=0,k=0,l=0,c=0,m=10;
		char ch;
		l=s.length();
		for(i=0;i<l;++i)
		{ch=s.charAt(i);p=String.valueOf(ch);
			try
			{
				if(p.equals("X")==false)
				{
					j=Integer.parseInt(p);
					k+=j*m;
					m--;
				}
				if(p.equals("X") && i==(l-1))k+=10;
			}
			catch(Exception e)
			{
				c=1;
			}
		}
		if(k%11!=0)++c;
		if(c==0)System.out.println("\nSum = "+k+"\nLeaves no remainder - valid ISBN");
		else System.out.println("\nSum = Invalid Input!!");
		System.out.println();
	}
}
