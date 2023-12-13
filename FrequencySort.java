/******************************************************************************

Sort a list in decreasing order of frequency if two frequencies are the same
then consider the order of insertion for sorting.



*******************************************************************************/
import java.util.*;
public class FrequencySort
{
	public static void main(String[] args) {
		List<Integer>li=Arrays.asList(4,2,8,3,3,1,1,8,8,6,4,6,6);
		Map<Integer,Integer>fm=new HashMap<>();
		for(Integer e:li)
		{
		    fm.put(e,fm.getOrDefault(e,0)+1);
		}
		
		li.sort((i,j)->{
		    int fc=Integer.compare(fm.get(j),fm.get(i));
		    return (fc!=0) ? fc:Integer.compare(li.indexOf(i),li.indexOf(j));
		});
		System.out.println(li);
	}
}
