/******************************************************************************
Write a code for dividing a number from 0 to 3 and  log 
the result if there is an exception log -1 as the result 
and also log the exception “Exception + error message(actual error msg)“.


*******************************************************************************/
import java.util.*;
public class HandelException
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 int divident=sc.nextInt();
		
		for(int i=0;i<=3;i++)
		{
		    int res=-1;
		   
		    try{
		    
		    res=divident/i;
		    System.out.println("Result of " + divident+" / "+i+" is: "+res);
		    }
		    catch(Exception e)
		    {
		        System.out.println("Result of " + divident+" / "+i+" is: -1");
		        System.out.println("Exception is:"+e.getMessage());
		    }
		}
	}
}
