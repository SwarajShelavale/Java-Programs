import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class FibonacciSeries
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int a=0,b=1,c;
		int count=10;
		System.out.print(a+ " ");
		System.out.print(b+ " ");
		for(int i=2;i<count;i++)
		{
		    c=a+b;
		    a=b;
		    b=c;
		    System.out.print(c + " ");
		}
	}
}
