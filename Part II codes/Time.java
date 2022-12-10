import java.io.*;
import java.util.*;
import java.lang.Math;
class Time
{
	public static void main (String[]args)
	{
		Scanner r = new Scanner (System.in);
		int i,j,k,il,ol,hd,md;
		double val;
		String it,ot;
		char M1,M2;
		int h1,h2,m1,m2,ici,ico,imi,imo;
		System.out.print("LOGIN TIME : ");
		it=r.nextLine();
		il=it.length();
		ici=it.indexOf(':');
		imi=it.indexOf('M');
		h1=Integer.parseInt(it.substring(0,ici));
		m1=Integer.parseInt(it.substring((ici+1),(ici+3)));
		M1=it.charAt(imi-1);

		System.out.print("\nLOGOUT TIME : ");
		ot=r.nextLine();
		ol=ot.length();
		ico=ot.indexOf(':');
		imo=ot.indexOf('M');
		h2=Integer.parseInt(ot.substring(0,ico));
		m2=Integer.parseInt(ot.substring((ico+1),(ico+3)));
		M2=it.charAt(imo-1);

		md=m2-m1;
		if(M1==M2)hd=h2-h1;
		else hd=12-h1+h2;
		if(md<0)
		{
			md+=60;
			--hd;
		}
		if(md==60)
		{
			++hd;
			md=0;
		}

		System.out.println("\nTOTAL TIME : "+hd+" HRS "+md+" MIN");
		val=((hd*60)+md)*0.16;
		System.out.println("\nYOUR AMMOUNT : Rs "+val);
	}
}