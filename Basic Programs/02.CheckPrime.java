import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CheckPrime
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int num=77;
		
		if(num<=1)
		    System.out.print("Non Prime");
	    else {
	        for(int i=2;i<(num/2);i++)
	        {
	            if((num%i)==0)
	            {
	                System.out.print("Non Prime");
	                return;
	            }
	        }
	         System.out.print("Prime");
	    }
	}
}
