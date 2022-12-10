import java.io.*;
import java.util.*;
class PrintJob
{
	int job[],Newjob,Capacity,Front,Rear;
	Scanner r = new Scanner (System.in);

	PrintJob()
	{
		Capacity = 20;
		Front=Rear=-1;
		createjob();
	}

	void createjob()
	{
		job=new int[Capacity];
	}

	void addJob()
	{

		if(Rear==(Capacity-1))System.out.println("PrintJob is full, cannot add anymore");
		else
		{
			++Rear;
			Newjob = r.nextInt();
			job[Rear] = Newjob;
			if(Front==-1)++Front;
		}
	}

	void removeJob()
	{
		if(Front>Rear || Rear==-1){System.out.println("PrintJob is empty");Front=Rear=-1;}
		else
		{
			System.out.println("Removed "+job[Front]);
			++Front;
		}
	}

	public static void main (String[]args)
	{
		Scanner r = new Scanner (System.in);
		int i;
		PrintJob ob = new PrintJob();
		while(1>0)
		{
		System.out.println("\nEnter 1 to add job OR 0 to remove job");
		int c = r.nextInt();
		if(c==1)ob.addJob();
		else if(c==0)ob.removeJob();
		else System.out.println("Invalid input!!");
		}
	}
}
