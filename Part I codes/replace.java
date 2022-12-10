import java.io.*;
import java.util.*;
class replace
{
	String str,substr;

	replace()
	{
		str=substr="";
	}

	replace(String s)
	{
		str=s;
	}

	void display()
	{
		System.out.println("Str : "+str);
		System.out.println("Substr : "+substr);
		int f=find_frequency();
		System.out.println("Frequency : "+f);
	}

	void getword(String ss)
	{
		substr = ss;
	}

	int find_frequency()
	{
		int i,f=0,j,k,sl=str.length(),l=substr.length();
		String ns;
		char c,sc=substr.charAt(0);
		for(i=0;i<(sl-l+1);++i)
		{
			c=str.charAt(i);
			if(sc!=c)continue;
			ns=str.substring(i,(i+l));
			if(ns.equals(/*¶*/substr))++f;
		}
		return f;
	}

	public static void main (String[]args)
	{
		Scanner r = new Scanner (System.in);
		System.out.print("Enter String : ");
		String k=r.nextLine();
		replace ob=new replace(k);
		System.out.print("Enter Substring to check : ");
		String ks=r.nextLine();
		ob.getword(ks);
		ob.display();
	}
}