import java.io.*;
import java.util.*;
class Binary
{
	int a[],n,l,u;
	Binary(int num)
	{
		n=num;
		a=new int [n];
		l=n-1;
		u=0;
	}

	public static void main (String[]args)
	{
		Scanner r = new Scanner (System.in);