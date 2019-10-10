package collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapInterface {

	public static void main(String[] args) 
	{
		Map<Integer,String> map = new HashMap<Integer, String>();
		map.put(1234, "Amit");
		map.put(4567, "Teju");
		map.put(7890, "Shubhada");
		map.put(null, "test");
		
		
		//System.out.println(map.get(1234));
		//System.out.println(map.get(null));
		
		for(Object i:map.keySet())
		{
			System.out.println(map.get(i));
		}
		System.out.println("****************");
		
		Set<Integer> set = map.keySet();
		Iterator<Integer> it = set.iterator();
		while(it.hasNext())
		{
			System.out.println(map.get(it.next()));
		}
 		
	}

}
