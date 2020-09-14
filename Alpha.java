import java.io.*;
import java.util.*;
class Alpham implements Runnable
{
	Thread t;
	String s2;
	public Alpham(String s,String s1)
	{
		t=new Thread(this,s);
		s2=s1;
		t.start();
	}
	synchronized public void run()
	{
		for(int i=0;i<3;i++)
			System.out.println(s2);
	}
}
class Alpha
{
public static void main(String args[])
{
	Alpham a1 = new Alpham("t1","A");
	Alpham a2 = new Alpham("t2","B");
	Alpham a3 = new Alpham("t3","C");
}
}