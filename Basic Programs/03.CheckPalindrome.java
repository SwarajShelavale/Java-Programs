
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CheckPalindrome
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    int num=1331;
	    int newNum = 0;
	    int temp=num;
	    while(temp!=0)
	    {
	        int rem=temp%10;
	        newNum= newNum*10 + rem;
	        temp/=10;
	    }
	    
	    if(newNum ==num)
	        System.out.print("Palindrome");
	    else 
	        System.out.print("Not Palindrome");
	}
}
