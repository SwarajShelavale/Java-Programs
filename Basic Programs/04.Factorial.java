
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Factorial
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    long n=10;
	    long factNum=1;
	    
	    for(int i=1;i<=n;i++)
	    {
	        factNum=factNum*i;
	    }
	    System.out.print(factNum);
	}
}
