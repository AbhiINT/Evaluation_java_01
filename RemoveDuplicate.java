/******************************************************************************
Write a code for removing duplicates in an arraylist. Keep it in O(1).
Input :-
     [1,2,2,3,4,4] 
output :-
     [1,2,3,4]

*******************************************************************************/
import java.util.*;
class Solution{
    public static int removeDuplicate(ArrayList<Integer>arr)
    {
        if (arr.size() == 0 || arr.size() == 1) {
        return 0;
    }
    
    int j = 0;
    for ( int i = 0; i < arr.size()-1 ; i++) {
        if (arr.get(i) != arr.get(i+1)) {
            arr.set(j++,arr.get(i));
        }
    }
    arr.set(j++,arr.get(arr.size()-1));
    return j;
    }
}
public class RemoveDuplicate
{
	public static void main(String[] args) {
		ArrayList<Integer>arr=new ArrayList<>();
		arr.add(1);   
		arr.add(2);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(4);
		arr.add(5);
		arr.add(6);
		arr.add(6);
		arr.add(7);
		int j=Solution.removeDuplicate(arr);
		
		for(int i=0;i<j;i++)
		{
		    System.out.print(arr.get(i)+" ");
		}
		
        

          
	}
}
