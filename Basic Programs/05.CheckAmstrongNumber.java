
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CheckAmstrongNumber
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    int n=158;
	    int noOfDigits =  ((int)Math.log10(n))+1;
	    int n2 = 0,temp=n;
	    while(temp!=0)
	    {
	        n2+= Math.pow(temp%10,noOfDigits);
	        temp/=10;
	    }
	    
	    if(n2==n)
	        System.out.print("YES");
	    else  
	        System.out.print("NO");
	}
}
