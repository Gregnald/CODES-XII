import java.io.*;
import java.util.*;
class time
{
	public static void main (String[]args)
	{
		Scanner r = new Scanner (System.in);
		String s="",t,s1,s2,a[]={"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Quarter","Sixteen","Seventeen","Eighteen","Nineteen","Twenty","Half"};

		int i,j,k1,k2,l,m,t1,n,c=0,t2;
		System.out.print("Enter time : ");
		t=r.nextLine();
		l=t.length();
		m=t.indexOf(',');
		t1=Integer.parseInt(t.substring(0,m));
		t2=Integer.parseInt(t.substring(m+1));
		k1=t2/10;
		k2=t2%10;
		if(k1==k2 && k2==0){System.out.println(t1+":"+t2+" "+a[t1]+" O'clock");return;}
		if(t2>30)
		{
			c=1;
			n=t2-30;
			if(n==30){System.out.println("Invalid Input");return;}
			n=30-n;
			++t1;
		}
		else n=t2;
		k2=n%10;
		if(n==30)s+=a[21]+" minutes past ";
		else if(n<=20)
		{
			s+=a[n];
			if(n!=15)s+=" minutes";
			if(c==1)s+=" to";
			else s+=" past";
		}
		else
		{

			s+=a[20]+" "+a[k2]+" minutes";
			if(c==1)s+=" to";
			else s+=" past";
		}
		s+=" "+a[t1];
		if(c==1)System.out.println((t1-1)+":"+t2+" "+s);
		else System.out.println(t1+":"+t2+" "+s);
	}
}
